package com.qdz.hop.common;

public enum ResultEnum {
    SUCCESS(200, "操作成功"),
    VALIDATE_FAILED(400, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "未授权限"),
    NOTFOUND(404, "服务器找不到请求的路径"),
	FAILED(500, "操作失败");
	
    private long code;
    private String message;

    private ResultEnum(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
