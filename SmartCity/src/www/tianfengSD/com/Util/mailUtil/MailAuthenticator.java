package www.tianfengSD.com.Util.mailUtil;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 用于登录用户名验证
 * @author Administrator
 *
 */
public class MailAuthenticator extends Authenticator {
	private String maileName;

	public String getMaileName() {
		return maileName;
	}

	public String getMailPassword() {
		return mailPassword;
	}

	private String mailPassword;

	/**
	 * 初始化邮箱和密码
	 * 
	 * @param username
	 *            邮箱
	 * @param password
	 *            密码
	 */
	public MailAuthenticator(String maileName, String mailPassword) {
		this.maileName = maileName;
		this.mailPassword = mailPassword;
	}

	public void setMaileName(String maileName) {
		this.maileName = maileName;
	}

	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(maileName, mailPassword);
	}

}
