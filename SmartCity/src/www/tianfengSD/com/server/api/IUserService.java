package www.tianfengSD.com.server.api;

import java.util.List;

import www.tianfengSD.com.Vo.UserVo;

/**
 * 用户先关信息接口类
 * @author lijianhong 
 *
 */
public interface IUserService {
	/**
	 * 获取用户列表
	 * @return List<UserVo>
	 */
	public List<UserVo> getUserList();
	
	/**
	 * 用户注册接口
	 * @param user
	 * @return
	 */
	public boolean registerUser(UserVo user);
	
	/**
	 * 用户登录验证接口
	 * @param user
	 * @return
	 */
	public boolean validateUser(UserVo user);
	
	
	/**
	 * 修改用户信息
	 * @param userVo
	 * @return true/false
	 */
	public boolean updateUserByUid(UserVo userVo);
	
	/**
	 * 根据ID获取用户信息
	 * @param UserId 用户ID
	 * @return 单个用户的详细信息
	 */
	public UserVo getUserByUId(UserVo userVo);
	
}
