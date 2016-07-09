package www.tianfengSD.com.Util.mailUtil;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * ���ڵ�¼�û�����֤
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
	 * ��ʼ�����������
	 * 
	 * @param username
	 *            ����
	 * @param password
	 *            ����
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
