package www.tianfengSD.com.Vo;

/**
 * 车辆表
 * 
 * @author 李建红
 *
 */
public class CartVo extends BaseVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * id int comment '车辆id' primary key not null auto_increment,
	 *  uid intcomment '用户id' not null ,
	 *  plate varchar(34) comment '车牌号' not null ,
	 * vinno varchar(34) comment '车架号' , 
	 * viewurl varchar(100) comment '车辆照片' not
	 * createtime datetime comment '用户创建时间' not null , 
	 * updatetime datetime comment '用户最后修改时间' , 
	 * remark varchar(200) comment '备注'
	 */
	private int id;
	private int uid;
	private String plate;
	private String vinno;
	private String viewurl;
	private String remark;
	/**
	 * 流水ID
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 用户ID
	 * @return
	 */
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * 车牌号码
	 * @return
	 */
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	/**
	 * 车架号
	 * @return
	 */
	public String getVinno() {
		return vinno;
	}

	public void setVinno(String vinno) {
		this.vinno = vinno;
	}
	/**
	 * 车牌照片
	 * @return
	 */
	public String getViewurl() {
		return viewurl;
	}

	public void setViewurl(String viewurl) {
		this.viewurl = viewurl;
	}
	/**
	 * 备注
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
