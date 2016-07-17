package www.tianfengSD.com.server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.tianfengSD.com.Vo.RepairVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.dao.IPropertyDao;
import www.tianfengSD.com.dao.IRepairDao;
import www.tianfengSD.com.server.api.IRepairService;
@Service
@Transactional
public class RepairService implements IRepairService {

	@Resource
	private IRepairDao iRepairDao;

	@Override
	public SendStautsVo AddRepair(RepairVo repairVo) {
		SendStautsVo vo=new SendStautsVo();
		 try {
			 iRepairDao.AddRepair(repairVo);
			 vo.setCode("300");
			 vo.setMsg("success");;
		} catch (Exception e) {
			vo.setCode("301");
			 vo.setMsg("error"+e.toString());;
		}
		 return vo;
	}

}
