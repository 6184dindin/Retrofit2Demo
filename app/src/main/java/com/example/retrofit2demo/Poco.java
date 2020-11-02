package com.example.retrofit2demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Poco implements Serializable {

    @SerializedName("ResultCode")
    @Expose
    private String resultCode;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("ResultData")
    @Expose
    private List<ResultDatum> resultData = null;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultDatum> getResultData() {
        return resultData;
    }

    public void setResultData(List<ResultDatum> resultData) {
        this.resultData = resultData;
    }

}
