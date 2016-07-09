package www.tianfengSD.com.Util;

import java.util.Random;

import net.sf.json.JSONObject;
import www.tianfengSD.com.Vo.UserVo;

public class CheckKey {
	/**
	 * 获取6为随机验证码
	 * @return
	 */
	public static int nextInt() {
		Random rand = new Random();
		int tmp = Math.abs(rand.nextInt());
		return tmp % (999999 - 100000 + 1) + 100000;
	}
}
