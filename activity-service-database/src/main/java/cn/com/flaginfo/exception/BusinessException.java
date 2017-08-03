package cn.com.flaginfo.exception;

/**
 * 业务运行异常类
 * @author lenovo
 *
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException() {
		super();
	}

	public BusinessException(String errMsg) {
		super(errMsg);
	}

}
