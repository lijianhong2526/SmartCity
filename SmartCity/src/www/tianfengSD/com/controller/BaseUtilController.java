package www.tianfengSD.com.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Util.CheckKey;
import www.tianfengSD.com.Util.HttpSenderShotInfoUtil;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;

/**
 * 工具服务提供类
 * 
 * @author lijianhong
 *
 */
@Controller
@RequestMapping("/BaseUtilService")
public class BaseUtilController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 获取验证码接口
	 * @param phone 电话号码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/sendCheckKey", method = { RequestMethod.GET })
	public @ResponseBody SendStautsVo sendCheckKey(@ModelAttribute(value = "phone") String phone,
			HttpServletRequest request, HttpServletResponse response) {
		int checkey = CheckKey.nextInt();
		String status = HttpSenderShotInfoUtil.SendInfo(phone, checkey);
		SendStautsVo vo = new SendStautsVo();
		if ("0".equals(status)) {
			vo.setCode("200");
			vo.setMsg("success");
			vo.setValue(String.valueOf(checkey));
		} else {
			vo.setCode(status);
			vo.setMsg("验证码发送失败");
		}
		return vo;
	}

}
