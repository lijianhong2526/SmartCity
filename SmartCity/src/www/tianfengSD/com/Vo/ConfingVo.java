package www.tianfengSD.com.Vo;

/**
 * 系统配置
 * 
 * @author lijianhong
 *
 */
public class ConfingVo extends BaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int configId;
	private String configDes;
	private String configValue;
	private String configType;

	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getConfigDes() {
		return configDes;
	}

	public void setConfigDes(String configDes) {
		this.configDes = configDes;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}
}
