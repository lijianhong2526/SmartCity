package www.tianfengSD.com.Vo;

import java.util.Date;

/**
 * 缴费清单Vo
 * 
 * @author Administrator
 *
 */
public class CostVo extends BaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cost_id;// 缴费单编号
	private HousVo housVo;
	private PropertyVo propertyVo;
	private Double water;
	private Double fWater;
	private Double electric;
	private Double fElectric;
	private Double fProperty;
	private Double fall;
	private int rent;
	private Date fTime;

	public int getCost_id() {
		return cost_id;
	}

	public void setCost_id(int cost_id) {
		this.cost_id = cost_id;
	}

	public HousVo getHousVo() {
		return housVo;
	}

	public void setHousVo(HousVo housVo) {
		this.housVo = housVo;
	}

	public PropertyVo getPropertyVo() {
		return propertyVo;
	}

	public void setPropertyVo(PropertyVo propertyVo) {
		this.propertyVo = propertyVo;
	}

	public Double getWater() {
		return water;
	}

	public void setWater(Double water) {
		this.water = water;
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

	public Double getFall() {
		return fall;
	}

	public void setFall(Double fall) {
		this.fall = fall;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public Date getfTime() {
		return fTime;
	}

	public void setfTime(Date fTime) {
		this.fTime = fTime;
	}
}
