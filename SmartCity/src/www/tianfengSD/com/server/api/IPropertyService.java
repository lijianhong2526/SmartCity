package www.tianfengSD.com.server.api;

import java.util.List;

import www.tianfengSD.com.Vo.PropertyVo;
import www.tianfengSD.com.Vo.apiVo.CostApiVO;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;

/**
 * 物业管理逻辑处理类
 * 
 * @author Administrator
 *
 */
public interface IPropertyService {

	/**
	 * 获取所有的物业信息
	 * 
	 * @return
	 */
	public List<PropertyVo> getAllProperty(String userId);

	/**
	 * 获取缴费清单以及详情
	 * 
	 * @param uid
	 * @return
	 */
	public List<CostApiVO> getCostByUid(String uid,String costId);

	/**
	 * 更新缴费状态
	 * 
	 * @param costId
	 */
	public SendStautsVo updateCostStateByCostId(String costId);
}
