package www.tianfengSD.com.Vo;

/**
 * 捐款明细表
 * @author Administrator
 *
 */
public class HelpDetilVo extends BaseVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String createDates;
	private Double helpMoney;
	private String uerNmae;
	private String urlPath;
	private String remark;
	private Integer helpId;
	private Integer userId;

	public Integer getHelpId() {
		return helpId;
	}
	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCreateDates() {
		return createDates;
	}
	public void setCreateDates(String createDates) {
		this.createDates = createDates;
	}
	public Double getHelpMoney() {
		return helpMoney;
	}
	public void setHelpMoney(Double helpMoney) {
		this.helpMoney = helpMoney;
	}
	public String getUerNmae() {
		return uerNmae;
	}
	public void setUerNmae(String uerNmae) {
		this.uerNmae = uerNmae;
	}
	public String getUrlPath() {
		return urlPath;
	}
	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
