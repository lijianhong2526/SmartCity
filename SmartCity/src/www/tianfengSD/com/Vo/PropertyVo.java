package www.tianfengSD.com.Vo;

import sun.net.www.content.audio.basic;

/**
 * 物业实体类
 * @author Administrator
 *
 */
public class PropertyVo extends BaseVo{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int propertyId;
	private String propertyName;
	private String propertyAddress;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	
}
