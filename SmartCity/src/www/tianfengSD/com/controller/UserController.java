package www.tianfengSD.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Vo.UserVo;
import www.tianfengSD.com.server.api.IUserService;

/**
 * 用户相关操作接口提供类
 * @author lijianhong
 *
 */
@Controller
@RequestMapping("/userService")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/getUserList", method = { RequestMethod.GET })
	public @ResponseBody List<UserVo> getUserList() {
		return userService.getUserList();
	}
	
	@RequestMapping(value = "/userLogin", method = { RequestMethod.POST })
	public @ResponseBody Boolean validateUser(@RequestBody UserVo userVo, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.validateUser(userVo);
	}
	
	@RequestMapping(value = "/updateUserByUid", method = { RequestMethod.POST })
	public @ResponseBody Boolean updateUserByUid(@RequestBody UserVo userVo, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.updateUserByUid(userVo);
	}
	
	@RequestMapping(value = "/getUserByUId", method = { RequestMethod.POST })
	public @ResponseBody UserVo getUserByUId(@RequestBody UserVo userVo, HttpServletRequest request,
			HttpServletResponse response) {
		return userService.getUserByUId(userVo);
	}
}
