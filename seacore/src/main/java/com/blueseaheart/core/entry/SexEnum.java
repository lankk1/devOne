package com.blueseaheart.core.entry;

/**
 * Created by Walker on 2018/5/30.
 */
public enum SexEnum {
    NAN("男", 1), NV("女", 0);
    private String sex;
    private Integer code;

    private SexEnum(String sex, Integer code) {
        this.sex = sex;
        this.code = code;
    }

    public String getSex() {
        return sex;
    }

    public Integer getCode() {
        return code;
    }

}
