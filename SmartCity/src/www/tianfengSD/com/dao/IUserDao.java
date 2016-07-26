package www.tianfengSD.com.dao;

import www.tianfengSD.com.Vo.UserVo;

/**
 * 用户星系获取
 * 
 * @author lijianhong
 *
 */
public interface IUserDao {

	public String userLogin(UserVo userVo);

	public UserVo getUserByUid(String userId);

	public void updateUserInfoById(UserVo userVo);
	
	public String getUid(UserVo userVo);

}
