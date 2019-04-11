package com.blueseaheart.core.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Walker on 2018/5/28.
 */
public class ResponseVo {
    private String errorMsg;
    private Integer errorCode;
    private Map<String, Object> data = new HashMap<String, Object>();

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
