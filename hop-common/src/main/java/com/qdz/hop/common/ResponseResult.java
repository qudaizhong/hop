package com.qdz.hop.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author qdz
 * @createDate 2020年3月8日 上午9:32:58
 * @updateDate 2020年3月8日 上午9:32:58
 * @version 1.0
 */
@Getter
@Setter
public class ResponseResult<T> {
	private long code;
	private String message;
	private T data;

	protected ResponseResult() {
		
	}

	protected ResponseResult(long code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
    public static <T> ResponseResult<T> success(T data) {
    	return success(data, ResultEnum.SUCCESS.getMessage());
    }
    
    public static <T> ResponseResult<T> success(T data, String message) {
        return new ResponseResult<T>(ResultEnum.SUCCESS.getCode(), message, data);
    }
    
    public static <T> ResponseResult<T> failed(ResultEnum errorCode) {
        return new ResponseResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }
    
    public static <T> ResponseResult<T> failed(String message) {
        return new ResponseResult<T>(ResultEnum.FAILED.getCode(), message, null);
    }

    public static <T> ResponseResult<T> failed() {
        return failed(ResultEnum.FAILED);
    }
    
    public static <T> ResponseResult<T> validateFailed() {
        return failed(ResultEnum.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> ResponseResult<T> validateFailed(String message) {
        return new ResponseResult<T>(ResultEnum.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> ResponseResult<T> unauthorized(T data) {
        return new ResponseResult<T>(ResultEnum.UNAUTHORIZED.getCode(), ResultEnum.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> ResponseResult<T> forbidden(T data) {
        return new ResponseResult<T>(ResultEnum.FORBIDDEN.getCode(), ResultEnum.FORBIDDEN.getMessage(), data);
    }
}
