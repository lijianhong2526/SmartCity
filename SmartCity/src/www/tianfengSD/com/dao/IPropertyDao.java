package www.tianfengSD.com.dao;

import java.util.List;
import java.util.Map;

import www.tianfengSD.com.Vo.PropertyVo;
import www.tianfengSD.com.Vo.apiVo.CostApiVO;

/**
 * 物业持久类
 * @author Administrator
 *
 */
public interface IPropertyDao {
	
	/**
	 * 获取所有物业列表
	 * @return
	 */
	public List<PropertyVo> getAllProperty(String userId);
	
	/**
	 * 获取缴费清单以及详情
	 * @param uid
	 * @return
	 */
	public List<CostApiVO> getCostbyUid(Map<String, String> param);
	
	/**
	 * 更新缴费状态
	 * @param costId
	 */
	public void updateCostStateByCostId(String costId);
}
