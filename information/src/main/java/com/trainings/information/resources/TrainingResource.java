package com.trainings.information.resources;

import com.trainings.information.models.Training;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainings")
public class TrainingResource {

    @RequestMapping("/{trainingId}")
    public Training getTrainingInfo(@PathVariable("trainingId") String trainingId) {
        return new Training(trainingId, "Intro to Python");

    }
}
