package www.tianfengSD.com.Vo;

import java.io.Serializable;
import java.util.Date;
/**
 * 基础公共类，如有公共字段可以进行添加
 * @author lijianhong
 *
 */
public class BaseVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 最后修改时间
	 */
	private Date lastuUdateDate;
	/**
	 * 最后创建时间
	 */
	private Date createDate;
	
	public Date getLastuUdateDate() {
		return lastuUdateDate;
	}
	
	public void setLastuUdateDate(Date lastuUdateDate) {
		this.lastuUdateDate = lastuUdateDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
