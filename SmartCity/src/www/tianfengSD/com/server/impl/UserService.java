package www.tianfengSD.com.server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.tianfengSD.com.Vo.UserVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.dao.IUserDao;
import www.tianfengSD.com.server.api.IUserService;

/**
 * 用户信息相关服务类
 * 
 * @author lijianhong
 *
 */
@Service
@Transactional
public class UserService implements IUserService {
	@Resource
	private IUserDao iUserDao;

	public String userLogin(UserVo userVo) {
		if (userVo != null) {
			userVo.setHeadUrl(userVo.getHeadUrl() == null ? "" : userVo.getHeadUrl());
			userVo.setHeadUrl(userVo.getNickName() == null ? "" : userVo.getNickName());
			userVo.setHeadUrl(userVo.getPhone() == null ? "" : userVo.getPhone());
		}
		return String.valueOf(iUserDao.userLogin(userVo));
	}

	public UserVo getUserByUid(String userId) {
		return iUserDao.getUserByUid(userId);
	}

	public SendStautsVo updateUserInfoById(UserVo userVo) {
		SendStautsVo vo = new SendStautsVo();
		try {
			iUserDao.updateUserInfoById(userVo);
			vo.setCode("300");
			vo.setMsg("success ");
		} catch (Exception e) {
			vo.setCode("301");
			vo.setMsg("error " + e);
		}
		return vo;
	}

}
