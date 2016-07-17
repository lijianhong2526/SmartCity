package www.tianfengSD.com.server.api;

import www.tianfengSD.com.Vo.RepairVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;

public interface IRepairService {
	/**
	 * 添加故障申报
	 * @param repairVo
	 */
	public SendStautsVo AddRepair(RepairVo repairVo);
}
