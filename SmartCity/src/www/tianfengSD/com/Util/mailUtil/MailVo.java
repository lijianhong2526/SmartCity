package www.tianfengSD.com.Util.mailUtil;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/***
 * 
 * @author 李建红
 *
 */
public class MailVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> sendTo;
	private List<String> sendCC;
	private Map<Object, Object> buItem;
	private String subJect;
	private String content;

	public List<String> getSendTo() {
		return sendTo;
	}

	public void setSendTo(List<String> sendTo) {
		this.sendTo = sendTo;
	}

	public List<String> getSendCC() {
		return sendCC;
	}

	public void setSendCC(List<String> sendCC) {
		this.sendCC = sendCC;
	}

	public Map<Object, Object> getBuItem() {
		return buItem;
	}

	public void setBuItem(Map<Object, Object> buItem) {
		this.buItem = buItem;
	}

	public String getSubJect() {
		return subJect;
	}

	public void setSubJect(String subJect) {
		this.subJect = subJect;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
