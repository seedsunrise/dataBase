package cn.com.flaginfo.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * 校验信息处理工具类
 * @author Administrator
 *
 */
public class BindingResultUtils {

	/**
	 * 拼接错误信息
	 * @param result
	 * @return
	 */
	public static String getErrorMsg(BindingResult result){
		if(result!=null){
			StringBuilder sb = new StringBuilder("");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError oe : errors){
				sb.append(oe.getDefaultMessage()).append(";");
			}
			return sb.toString();
		}else{
			return null;
		}
	}
	/**
	 * 校验对象，返回错误信息
	 * @param obj
	 * @return
	 */
	public static <T> String checkObject(T obj){
		if(obj==null){
			return "提交对象不能为空";
		}
		//得到验证对象
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<T>> set = validator.validate(obj);
		StringBuilder sb = new StringBuilder();
		for(Iterator<ConstraintViolation<T>> iterator = set.iterator();iterator.hasNext();){
			ConstraintViolation<T> constraintViolation = iterator.next();
			sb.append(constraintViolation.getMessage()).append(";");
		}
		return sb.toString();
	}
}
