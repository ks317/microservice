package com.trainings.ratings.resources;

import com.trainings.ratings.models.LearnerRating;
import com.trainings.ratings.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
    @RequestMapping("trainings/{trainingId}")
    public Rating getRating(@PathVariable("trainingId") String trainingId) { return new Rating(trainingId, 6); }

    @RequestMapping("learners/{learnerId}")
    public LearnerRating getLearnerRating(@PathVariable("learnerId") String learnerId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("456", 6)
        );
        LearnerRating learnerRating = new LearnerRating();
        learnerRating.setLearnerRating(ratings);
        return learnerRating;

    }
}
