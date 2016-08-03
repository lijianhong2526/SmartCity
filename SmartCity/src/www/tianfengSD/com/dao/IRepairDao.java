package www.tianfengSD.com.dao;

import java.util.List;

import www.tianfengSD.com.Vo.RepairVo;

/**
 * 故障申报Dao
 * @author Administrator
 *
 */
public interface IRepairDao {
	
	/**
	 * 添加故障申报
	 * @param repairVo
	 */
	public void AddRepair(RepairVo repairVo);
	
	
	public List<RepairVo> getRepairListByUid(String uid);
	
}
