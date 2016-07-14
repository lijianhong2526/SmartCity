package www.tianfengSD.com.Vo;

import java.util.Date;

public class UserVo extends BaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int U_id;
	private String U_Name;
	private String U_Phone;
	private String U_NicName;
	private String U_headurl;
	private int Account_type;
	private Date createDate;
	private Date latstUpdate;
	private String wx_open_id;
	private String Electronic_id;

	public int getU_id() {
		return U_id;
	}

	public void setU_id(int u_id) {
		U_id = u_id;
	}

	public String getU_Name() {
		return U_Name;
	}

	public void setU_Name(String u_Name) {
		U_Name = u_Name;
	}

	public String getU_Phone() {
		return U_Phone;
	}

	public void setU_Phone(String u_Phone) {
		U_Phone = u_Phone;
	}

	public String getU_NicName() {
		return U_NicName;
	}

	public void setU_NicName(String u_NicName) {
		U_NicName = u_NicName;
	}

	public String getU_headurl() {
		return U_headurl;
	}

	public void setU_headurl(String u_headurl) {
		U_headurl = u_headurl;
	}

	public int getAccount_type() {
		return Account_type;
	}

	public void setAccount_type(int account_type) {
		Account_type = account_type;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLatstUpdate() {
		return latstUpdate;
	}

	public void setLatstUpdate(Date latstUpdate) {
		this.latstUpdate = latstUpdate;
	}

	public String getWx_open_id() {
		return wx_open_id;
	}

	public void setWx_open_id(String wx_open_id) {
		this.wx_open_id = wx_open_id;
	}

	public String getElectronic_id() {
		return Electronic_id;
	}

	public void setElectronic_id(String electronic_id) {
		Electronic_id = electronic_id;
	}
}
