package com.rxqp.model;

/**
 * Created by mengfanfei on 2017/6/27.
 */
public class Result {
    private Boolean isSuccess;
    private String description;

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
