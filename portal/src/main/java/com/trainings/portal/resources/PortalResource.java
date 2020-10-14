package com.trainings.portal.resources;

import com.trainings.portal.models.LearnerRating;
import com.trainings.portal.models.Rating;
import com.trainings.portal.models.Training;
import com.trainings.portal.models.TrainingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/portal")
public class PortalResource {

    //injecting the Bean RestTemplate
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{learnerId}")
    public List<TrainingItem> getPortal(@PathVariable("learnerId") String learnerId) {

        LearnerRating learnerRating = restTemplate.getForObject("http://training-rating-microservice/ratings/learners/" + learnerId, LearnerRating.class);

        return learnerRating.getLearnerRating().stream().map(rating -> {

            // for each training ID, call training information microservice and get the details
            Training training = restTemplate.getForObject("http://training-info-microservice/trainings/" + rating.getTrainingId(), Training.class);

            //consolidating the microservices
            return new TrainingItem(training.getTrainingName(), training.getDetails(), rating.getTrainingRating());


        })
        .collect(Collectors.toList());
//        return Collections.singletonList(
//                new TrainingItem("Applied Data Science", "Data Science Specialization with Python", 7)
//        );
    }

}
