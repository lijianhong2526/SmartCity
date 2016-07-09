package www.tianfengSD.com.Util;
import com.bcloud.msg.http.HttpSender;

/**
 * 调用第三方短信平台发送短信接口
 * @author Administrator
 *
 */
public class HttpSenderShotInfoUtil {
	
	
	public static String SendInfo(String phon,int checkKey) {
		String url = "http://222.73.117.169/msg/";// 应用地址
		String account = "N5854811";// 账号
		String pswd = "Psce9282";// 密码
		String mobile = phon;// 手机号码，多个号码使用","分割
		String msg = "【智慧惠东】您好，您的验证码是"+checkKey;// 短信内容
		boolean needstatus = true;// 是否需要状态报告，需要true，不需要false
		String extno = null;// 扩展码
		try {
			String returnString = HttpSender.batchSend(url, account, pswd, mobile, msg, needstatus, extno, "");
			System.out.println(returnString);
			String [] test=returnString.split(",");
			System.out.println(test[1].split("\n")[0]);
			return test[1].split("\n")[0];
		} catch (Exception e) {
			e.printStackTrace();
			return "500";
		}
	}
	
	
	/*public static void main(String[] args) {
		HttpSenderShotInfoUtil.SendInfo("13680796664,18818542910", 654896);
	}*/
}
