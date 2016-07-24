package www.tianfengSD.com.Vo.apiVo;

import www.tianfengSD.com.Vo.BaseVo;

/**
 * 缴费清单Api服务VO
 * 
 * @author Administrator
 *
 */
public class CostApiVO extends BaseVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String costId;
	private String ownerName;
	private String propertyName;
	private String buildNo;// 单元楼编号
	private String houseNo;// 房间编号
	private Double Water;// 水量
	private Double fWater;// 水费
	private Double electric;// 用电量
	private Double fElectric;// 电费
	private Double fProperty;// 物业费
	private int rent;// 房租
	private Double fall;// 总金额
	private int state;// 状态
	private String fTime;// 费用月份
	private String code;
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getBuildNo() {
		return buildNo;
	}

	public String getCostId() {
		return costId;
	}

	public void setCostId(String costId) {
		this.costId = costId;
	}

	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Double getWater() {
		return Water;
	}

	public void setWater(Double water) {
		Water = water;
	}

	public Double getfWater() {
		return fWater;
	}

	public void setfWater(Double fWater) {
		this.fWater = fWater;
	}

	public Double getElectric() {
		return electric;
	}

	public void setElectric(Double electric) {
		this.electric = electric;
	}

	public Double getfElectric() {
		return fElectric;
	}

	public void setfElectric(Double fElectric) {
		this.fElectric = fElectric;
	}

	public Double getfProperty() {
		return fProperty;
	}

	public void setfProperty(Double fProperty) {
		this.fProperty = fProperty;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	

	public Double getFall() {
		return fall;
	}

	public void setFall(Double fall) {
		this.fall = fall;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getfTime() {
		return fTime;
	}

	public void setfTime(String fTime) {
		this.fTime = fTime;
	}
}
