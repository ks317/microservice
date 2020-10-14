package com.trainings.portal.models;

import java.util.List;

public class LearnerRating {
    private String learnerId;
    private List<Rating> learnerRating;

    public String getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(String learnerId) {
        this.learnerId = learnerId;
    }

    public List<Rating> getLearnerRating() {
        return learnerRating;
    }

    public void setLearnerRating(List<Rating> learnerRating) {
        this.learnerRating = learnerRating;
    }

}
