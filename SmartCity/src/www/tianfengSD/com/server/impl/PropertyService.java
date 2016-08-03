package www.tianfengSD.com.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jpush.api.utils.StringUtils;
import www.tianfengSD.com.Vo.PropertyVo;
import www.tianfengSD.com.Vo.apiVo.CostApiVO;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.dao.IPropertyDao;
import www.tianfengSD.com.server.api.IPropertyService;

@Service
@Transactional
public class PropertyService implements IPropertyService {

	@Resource
	private IPropertyDao iPropertyDao;

	@Override
	public List<PropertyVo> getAllProperty(String userId) {
		return iPropertyDao.getAllProperty(userId);
	}

	@Override
	public List<CostApiVO> getCostByUid(String uid,String costId) {
		List<CostApiVO> list=new ArrayList<CostApiVO>();
		CostApiVO vo;
		if(StringUtils.isEmpty(uid)&&StringUtils.isEmpty(costId)){
			 vo=new CostApiVO();
			 vo.setCode("301");
			 vo.setMsg("error Uid or costId is null");
			 list.add(vo);
			 return list;
		}
		else {
			Map<String, String> map=new HashMap<>();
			map.put("uid", uid);
			map.put("costId", costId);
			return iPropertyDao.getCostbyUid(map);
		}
		
	}

	@Override
	public SendStautsVo updateCostStateByCostId(String costId) {
		SendStautsVo vo =new SendStautsVo();
		try {
			if(StringUtils.isEmpty(costId)){
				vo.setMsg("301");
				vo.setMsg("error costId is null");
			}
			iPropertyDao.updateCostStateByCostId(costId);
			vo.setCode("300");
			vo.setMsg("success");
		} catch (Exception e) {
			vo.setMsg("301");
			vo.setMsg("error"+e.toString());
		}
		return vo;
	}
}
