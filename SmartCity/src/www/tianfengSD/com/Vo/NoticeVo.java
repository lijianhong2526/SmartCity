package www.tianfengSD.com.Vo;

import java.util.Date;

/**
 * 公告
 * 
 * @author Administrator
 *
 */
public class NoticeVo {
	private Integer noticeId;// 公告ID
	private String noticeTitle;// 公告标题
	private String noticeContent;// 公告内容
	private String shotContent;// 公告截取
	private String propertyNameOffice;// 管理处签名
	private String createDate;// 创建时间
	private Integer propertyId;

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getShotContent() {
		return shotContent;
	}

	public void setShotContent(String shotContent) {
		this.shotContent = shotContent;
	}

	public String getPropertyNameOffice() {
		return propertyNameOffice;
	}

	public void setPropertyNameOffice(String propertyNameOffice) {
		this.propertyNameOffice = propertyNameOffice;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
