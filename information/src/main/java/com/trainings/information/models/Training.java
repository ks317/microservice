package com.trainings.information.models;

public class Training {
    private String trainingId;
    private String trainingName;
    private String details;

    public Training(){

    }

    public Training(String trainingId, String trainingName) {
        this.trainingId = trainingId;
        this.trainingName = trainingName;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }
}
