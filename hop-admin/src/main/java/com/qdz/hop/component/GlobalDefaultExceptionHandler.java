package com.qdz.hop.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.qdz.hop.common.ResponseResult;
import com.qdz.hop.common.ResultEnum;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author qdz
 * @createDate 2020年3月9日 下午12:25:03
 * @updateDate 2020年3月9日 下午12:25:03
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	/**
	 * 
	 * @author qdz
	 * @createDate 2020年3月9日 下午12:25:08
	 * @updateDate 2020年3月9日 下午12:25:08
	 * @version 1.0
	 * @param req
	 * @param ex
	 * @return
	 */
	@ExceptionHandler
	@ResponseBody
	public ResponseResult<String> defaultErrorHandler(HttpServletRequest req, RuntimeException ex) {
		ex.printStackTrace();
		log.error("捕获全局异常, {}", ex.getMessage());
		return ResponseResult.failed();
	} 
 
	/**
	 * 捕获类内所有的异常
	 * 
	 * @param ex
	 * @return
	 */
//	@ExceptionHandler(value = Exception.class)
//	public ModelAndView exceptionHandelByThymeleaf(Exception ex, HttpServletRequest req) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("error");
//		mav.addObject("exception", ex.getMessage());
//		mav.addObject("url", req.getRequestURL());
//		return mav;
//	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseResult<?> handle(HttpServletRequest request, NoHandlerFoundException e) {
        return ResponseResult.failed(ResultEnum.NOTFOUND);
    }
 
}