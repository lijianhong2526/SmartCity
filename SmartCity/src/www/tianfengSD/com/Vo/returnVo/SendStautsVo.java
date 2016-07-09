package www.tianfengSD.com.Vo.returnVo;

import java.io.Serializable;

public class SendStautsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;//状态码
	private String msg;//描述
	private String value;//值

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
