package www.tianfengSD.com.server.api;

import www.tianfengSD.com.Vo.UserVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;

/**
 * 用户先关信息接口类
 * 
 * @author lijianhong
 *
 */
public interface IUserService {
	
	/**
	 * 用户登录
	 * @param userVo
	 * @return
	 */
	public String userLogin(UserVo userVo);

	/**
	 * 根据用户ID获取用户信息
	 * @param userId
	 * @return
	 */
	public UserVo getUserByUid(String userId);
	
	/**
	 * 根据用户ID更新用户信息
	 * @param userVo
	 */
	public SendStautsVo updateUserInfoById(UserVo userVo);
}
