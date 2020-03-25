package com.qdz.hop.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qdz.hop.common.ResponseResult;
import com.qdz.hop.common.ResultEnum;

/**
 * 处理404
 * @author qdz
 * @createDate 2020年3月12日 下午1:25:37
 * @updateDate 2020年3月12日 下午1:25:37
 * @version 1.0
 */
@Controller
public class NotFoundErrorController implements ErrorController{

	@ExceptionHandler(value = { Exception.class })
	@ResponseBody
	@RequestMapping("/error")
	public ResponseResult<?> error(HttpServletRequest request, HttpServletResponse response) {
		// 404处理
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        response.setStatus(200);
        
        if(ResultEnum.NOTFOUND.getCode() == statusCode) {
        	return ResponseResult.failed(ResultEnum.NOTFOUND);
        }else {
        	return ResponseResult.failed(ResultEnum.FAILED);
        }
	}

	@Override
	public String getErrorPath() {
		return "error";
	}
}
