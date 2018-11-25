package top.zhuofai.exception;

public class SynException extends Exception {
    // 存储提示信息的
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SynException(String message) {
        this.message = message;
    }
}
