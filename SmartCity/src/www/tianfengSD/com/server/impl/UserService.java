package www.tianfengSD.com.server.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.tianfengSD.com.Vo.UserVo;
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
	private IUserDao userDao;

	public List<UserVo> getUserList() {
		return userDao.getUserList();
	}

	public boolean registerUser(UserVo user) {
		Boolean isFlag = false;
		try {
			userDao.registerUser(user);
			isFlag = true;
		} catch (Exception e) {
			System.out.println("=================================="+e);
			isFlag = false;
		}
		return isFlag;
	}

	@Override
	public boolean validateUser(UserVo user) {
		Boolean isFlag = false;
		try {
			userDao.validateUser(user);
			isFlag = true;
		} catch (Exception e) {
			isFlag = false;
		}
		return isFlag;
	}

	@Override
	public boolean updateUserByUid(UserVo userVo) {
		Boolean isFlag = false;
		try {
			userDao.updateUserByUid(userVo);
			isFlag = true;
		} catch (Exception e) {
			isFlag = false;
		}
		return isFlag;
	}

	@Override
	public UserVo getUserByUId(UserVo userVo) {
		return userDao.getUserByUId(userVo);
	}

}
