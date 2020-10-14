package com.trainings.ratings.models;

public class Rating {
    private String trainingId;
    private int trainingRating;

    public Rating(String trainingId, int trainingRating) {
        this.trainingId = trainingId;
        this.trainingRating = trainingRating;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public int getTrainingRating() {
        return trainingRating;
    }

    public void setTrainingRating(int trainingRating) {
        this.trainingRating = trainingRating;
    }
}
