package www.tianfengSD.com.Vo;

/**
 * 故障申报
 * 
 * @author Administrator
 *
 */
public class RepairVo extends BaseVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String repairId;
	private String repairContent;
	private String urlPath;
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getRepairId() {
		return repairId;
	}

	public void setRepairId(String repairId) {
		this.repairId = repairId;
	}

	public String getRepairContent() {
		return repairContent;
	}

	public void setRepairContent(String repairContent) {
		this.repairContent = repairContent;
	}
}
