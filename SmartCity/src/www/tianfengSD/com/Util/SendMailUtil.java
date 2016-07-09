package www.tianfengSD.com.Util;

import www.tianfengSD.com.Util.mailUtil.MailVo;
import www.tianfengSD.com.Util.mailUtil.ReadHtmlFile;
import www.tianfengSD.com.Util.mailUtil.SimpleMail;
import www.tianfengSD.com.Util.mailUtil.SimpleMailSender;

/***
 * 
 * @author lijianhong
 *  邮件发送接口工具类
 */
public class SendMailUtil {
   
	//邮件发送接口
	public static void SendMail(MailVo maile){
		SimpleMail sm = new SimpleMail();
		sm.setSubject(maile.getContent());
		sm.setContent(maile.getSubJect());
		SimpleMailSender sms = new SimpleMailSender("lijianhong2526@163.com",
				"ljh2526");
		try {
			sms.send("lijianhong2526@163.com", sm);
			System.out.println("执行完成！！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
