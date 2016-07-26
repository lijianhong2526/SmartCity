package www.tianfengSD.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Vo.NoticeVo;
import www.tianfengSD.com.Vo.UserVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.server.api.IUserService;

/**
 * 用户相关操作接口提供类
 * 
 * @author lijianhong
 *
 */
@Controller
@RequestMapping("/userService")
public class UserController {
	@Autowired
	private IUserService iUserService;

	@RequestMapping(value = "/userLogin", method = { RequestMethod.POST })
	public @ResponseBody SendStautsVo userLogin(@RequestBody UserVo userVo, HttpServletRequest request,
			HttpServletResponse response) {
		SendStautsVo vo = new SendStautsVo();
		try {
			String userId = iUserService.userLogin(userVo);
			vo.setCode("300");
			vo.setMsg("success ");
			vo.setValue(userId);
		} catch (Exception e) {
			vo.setCode("301");
			vo.setMsg("error " + e);
		}
		return vo;
	}

	@RequestMapping(value = "/updateUserInfoById", method = { RequestMethod.POST })
	public @ResponseBody SendStautsVo updateUserInfoById(@RequestBody UserVo userVo, HttpServletRequest request,
			HttpServletResponse response) {
		return iUserService.updateUserInfoById(userVo);
	}

	@RequestMapping(value = "/getUserByUid", method = { RequestMethod.GET })
	public @ResponseBody UserVo getUserByUid(@ModelAttribute(value = "userId") String userId,
			HttpServletRequest request, HttpServletResponse response) {
		return iUserService.getUserByUid(userId);
	}
}
