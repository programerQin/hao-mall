package com.qsh.mall;

/**
 * @description: 响应状态码
 * @author： 秦
 * @date: 2024/3/10
 * @Copyright： 老当益壮，奋起直追！
 */
public enum ResponeCode {
    SUCCESSS(20000, "操作成功"),
    FAIL(50000, "操作失败"),
    ERROR(50001, "系统异常");

    private Integer code;
    private String message;

    ResponeCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
