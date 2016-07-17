/*package com.fh.util;

import java.util.HashMap;
import java.util.Map;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import com.fh.controller.base.BaseController;

*//***
 * 极光推送
 * 
 * @author wgxue 2016-1-27 15:57:10
 *//*

public class JPushClientUtil extends BaseController {
//	protected static final Logger LOG = LoggerFactory.getLogger(JPushClientUtil.class);
	
	public static String TITLE = null;
	public static String MSG_CONTENT = null;
	public static String USER_ID = null;
//	public static String ALERT = "收到QQ告诉我一下啊";
	public static String CONTENT_TYPE=null;

	private static JPushClient jpush = null;
	private static JPushClient jpushIOS = null;
	//IOS正式库推送为true 测试推送为false
	private static boolean isFormal = true;
	

	public static final int MAX = Integer.MAX_VALUE;
	public static final int MIN = (int) MAX / 2;
	
	*//**
	 * 保存离线的时长。秒为单位。最多支持10天（864000秒）。 0 表示该消息不保存离线。即：用户在线马上发出，当前不在线用户将不会收到此消息。
	 * 此参数不设置则表示默认，默认为保存1天的离线消息（86400秒)。
	 *//*
	private static int maxRetryTimes = 60 * 60 * 24 * 10;


	*//***
	 * 
	 * 我们经纪帮的应用在极光申请了两个key 所以要区分下安卓和IOS
	 * 
	 *//*
	// 安卓
	@SuppressWarnings("deprecation")
	private static void init() {
		String appKey = "232a849298859d3b30fc5feb";// AppKey必填，例如232a849298859d3b30fc5feb
		String masterSecret = "d7d12cf6f1967f5f430b539c";// 必填，每个应用都对应一个masterSecret
		jpush = new JPushClient(masterSecret, appKey, maxRetryTimes);
	}

	// IOS
	@SuppressWarnings("deprecation")
	private static void initIOS() {
		String appKey = "b43cf134000a235198908f0a";// AppKey必填，例如232a849298859d3b30fc5feb
		String masterSecret = "87f234cd7f2df5d975b22641";// 必填，每个应用都对应一个masterSecret
		jpushIOS = new JPushClient(masterSecret, appKey, maxRetryTimes);
	}

	*//**
	 * 给单个人推送消息
	 * 
	 * @param msgTitle
	 * @param msgContent
	 * @param userid
	 *            用户id（uuid）
	 *//*
	public static void pushMessage(String msgTitle, String msgContent,String msgContentType,String userId) {
		
		TITLE = msgTitle;//标题
		MSG_CONTENT = msgContent;//消息
		CONTENT_TYPE = msgContentType;//类型
		USER_ID =userId;//UserId
		
		init();// 安卓
		initIOS();// IOS

		PushResult msgResult = null;// 安卓
		PushResult msgResultIOS = null;// 苹果

		// 安卓
		try {
			if (null != jpush) {
				msgResult = jpush
						.sendPush(buildPushObject_android_tag_alertWithTitle());
			}
			if (msgResult.isResultOK()) {
				System.out.println(msgResult + ",Android 用户推送成功！UserId:"
						+ userId);
				//isResult=false;
			}

		} catch (APIConnectionException e) {
			//LOG.error("Connection error. Should retry later. ", e);

		} catch (APIRequestException e) {
			LOG.info("Android Failed！ User ID：" + userId
					+ ",The message can be ignored, user may is apple mobile.");
//			LOG.error(
//					"Error response from JPush server. Should review and fix it. ",
//					e);
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
		}

		// 苹果
		//if (isResult) {
			try {
				if (null != jpushIOS) {
					msgResultIOS = jpushIOS
							.sendPush(buildPushObject_ios_tagAnd_alertWithExtrasAndMessage());
				}
				if (msgResultIOS.isResultOK()) {
					System.out.println(msgResultIOS + ",苹果用户推送成功！UserId:"
							+ userId);
				}

			} catch (APIConnectionException e) {
				//LOG.error("Connection error. Should retry later. ", e);

			} catch (APIRequestException e) {
				LOG.info("Apple Failed！ User ID："
						+ userId
						+ ",The message can be ignored, user may is Android mobile.");
//				LOG.error(
//						"Error response from JPush server. Should review and fix it. ",
//						e);
				LOG.info("HTTP Status: " + e.getStatus());
				LOG.info("Error Code: " + e.getErrorCode());
				LOG.info("Error Message: " + e.getErrorMessage());
				LOG.info("Msg ID: " + e.getMsgId());
			}
	}
	
	//IOS
    public static PushPayload buildPushObject_ios_tagAnd_alertWithExtrasAndMessage() {
        return PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.alias(USER_ID))
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.newBuilder()
                                .setAlert(MSG_CONTENT)
                                .setBadge(1)
                                .setSound("happy.caf")
                                .addExtra("type", CONTENT_TYPE)
                                .build())
                        .build())
                 .setOptions(Options.newBuilder()
                         .setApnsProduction(isFormal)
                         .build())
                 .build();
    }
    //Android
    public static PushPayload buildPushObject_android_tag_alertWithTitle() {
		Map<String, String> extras = new HashMap<String, String>();
		// 附加参数
		extras.put("type", CONTENT_TYPE);
        return PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.alias(USER_ID))
                .setNotification(Notification.android(MSG_CONTENT, TITLE, extras))
                .build();
    }
}
*/