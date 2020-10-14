package com.trainings.portal.models;

public class TrainingItem {
    private String trainingName;
    private String trainingDetail;
    private int trainingRating;

    public TrainingItem(String trainingName, String trainingDetail, int trainingRating) {
        this.trainingName = trainingName;
        this.trainingDetail = trainingDetail;
        this.trainingRating = trainingRating;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getTrainingDetail() {
        return trainingDetail;
    }

    public void setTrainingDetail(String trainingDetail) {
        this.trainingDetail = trainingDetail;
    }

    public int getTrainingRating() {
        return trainingRating;
    }

    public void setTrainingRating(int trainingRating) {
        this.trainingRating = trainingRating;
    }
}
