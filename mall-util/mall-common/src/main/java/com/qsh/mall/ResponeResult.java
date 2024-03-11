package com.qsh.mall;

/**
 * @description: 响应结果
 * @author： 秦
 * @date: 2024/3/10
 * @Copyright： 老当益壮，奋起直追！
 */
public class ResponeResult<T> {
    private String message;
    private Integer code;
    private T data;

    public ResponeResult(String message, Integer code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public ResponeResult(ResponeCode responeCode, T data) {
        this.message = responeCode.getMessage();
        this.code = responeCode.getCode();
        this.data = data;
    }

    public static ResponeResult ok() {
        return new ResponeResult(ResponeCode.SUCCESSS, null);
    }

    public static ResponeResult ok(Object data) {
        return new ResponeResult(ResponeCode.SUCCESSS, data);
    }

    public static ResponeResult fail() {
        return new ResponeResult(ResponeCode.FAIL, null);
    }

    public static ResponeResult fail(String message) {
        return new ResponeResult(message, ResponeCode.FAIL.getCode(), null);
    }

    public static ResponeResult fail(Integer code) {
        return new ResponeResult(null, code, null);
    }

    public static ResponeResult customicResult(String message, Integer code) {
        return new ResponeResult(message, code, null);
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public T getData() {
        return data;
    }
}
