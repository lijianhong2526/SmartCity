package www.tianfengSD.com.Vo;

import net.sf.json.JSONObject;
import www.tianfengSD.com.Util.Md5Util;

public class UserVo extends BaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String password;
	private String wx_openid;
	private String qq_openid;
	private String phone;
	private String login_type;
	private String account_type;
	private String headurl;
	private int integral;
	private String nickname;
	private String remark;
	

	/**
	 * 流水号
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 密码（MD5加密）
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = Md5Util.GetMD5Code(password);
	}

	/**
	 * 微信ID
	 * 
	 * @return
	 */
	public String getWx_openid() {
		return wx_openid;
	}

	public void setWx_openid(String wx_openid) {
		this.wx_openid = wx_openid;
	}

	/**
	 * QQ ID
	 * 
	 * @return
	 */
	public String getQq_openid() {
		return qq_openid;
	}

	public void setQq_openid(String qq_openid) {
		this.qq_openid = qq_openid;
	}

	/**
	 * 手机号码
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 用户类型
	 * 
	 * @return
	 */
	public String getLogin_type() {
		return login_type;
	}

	public void setLogin_type(String login_type) {
		this.login_type = login_type;
	}

	/**
	 * 帐号类型
	 * 
	 * @return
	 */
	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	/**
	 * 头像路径
	 * 
	 * @return
	 */
	public String getHeadurl() {
		return headurl;
	}

	public void setHeadurl(String headurl) {
		this.headurl = headurl;
	}

	/**
	 * 用户总积分
	 * 
	 * @return
	 */
	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	/**
	 * 昵称
	 * 
	 * @return
	 */
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * 备注
	 * 
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
