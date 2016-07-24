package www.tianfengSD.com.Vo;

import java.util.List;

/**
 * 帮帮主表
 * 
 * @author Administrator
 *
 */
public class HelpeVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int helpeId;
	private String helpTitle;
	private double HelpMoney;
	private String Phone;
	private String picUrl;
	private String helpContent;
	private String shotContent;
	private String createDate;
	private String creteUser;
	private int status;
	private int loveCount;
	private int nowHelpCount;
	private int nowPage;
	private double nowMoney;
	private int detileCount;
	private List<HelpDetilVo> helpDetiList;

	public int getLoveCount() {
		return loveCount;
	}

	public void setLoveCount(int loveCount) {
		this.loveCount = loveCount;
	}

	public String getShotContent() {
		return shotContent;
	}

	public void setShotContent(String shotContent) {
		this.shotContent = shotContent;
	}

	public List<HelpDetilVo> getHelpDetiList() {
		return helpDetiList;
	}

	public void setHelpDetiList(List<HelpDetilVo> helpDetiList) {
		this.helpDetiList = helpDetiList;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getNowHelpCount() {
		return nowHelpCount;
	}

	public void setNowHelpCount(int nowHelpCount) {
		this.nowHelpCount = nowHelpCount;
	}

	public int getHelpeId() {
		return helpeId;
	}

	public void setHelpeId(int helpeId) {
		this.helpeId = helpeId;
	}

	public String getHelpTitle() {
		return helpTitle;
	}

	public void setHelpTitle(String helpTitle) {
		this.helpTitle = helpTitle;
	}

	public double getHelpMoney() {
		return HelpMoney;
	}

	public void setHelpMoney(double helpMoney) {
		HelpMoney = helpMoney;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getHelpContent() {
		return helpContent;
	}

	public void setHelpContent(String helpContent) {
		this.helpContent = helpContent;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreteUser() {
		return creteUser;
	}

	public void setCreteUser(String creteUser) {
		this.creteUser = creteUser;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getNowMoney() {
		return nowMoney;
	}

	public void setNowMoney(double nowMoney) {
		this.nowMoney = nowMoney;
	}

	public int getDetileCount() {
		return detileCount;
	}

	public void setDetileCount(int detileCount) {
		this.detileCount = detileCount;
	}

}
