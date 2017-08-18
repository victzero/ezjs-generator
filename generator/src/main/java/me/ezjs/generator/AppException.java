package me.ezjs.generator;

/**
 * Created by zero-mac on 17/8/19.
 */
public class AppException extends RuntimeException {

    protected String msg;

    public AppException() {
    }

    public AppException(final String message) {
        super(message);
    }

    public AppException(Exception e) {
        super(e);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
