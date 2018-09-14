package team.whatdev.shop.utils.exception;

/**
 * 算法异常
 */
public class AlgorithmException extends RuntimeException  {

    /* 操作类型 */
    private String operation;
    /* 操作内容 */
    private Object msg;

    /**
     * 生成异常类
     * @param operation 操作类型
     * @param message 操作内容
     */
    public AlgorithmException(String operation, String message, Throwable throwable) {
        super("[操作类型："+ operation +"], [操作内容："+ message +"]", throwable);
        this.operation = operation;
        this.msg = message;
    }

    public String getMsg() {
        return msg.toString();
    }

    public String getOperation() {
        return operation;
    }

}
