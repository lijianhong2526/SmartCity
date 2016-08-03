package www.tianfengSD.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Vo.PropertyVo;
import www.tianfengSD.com.Vo.UserVo;
import www.tianfengSD.com.Vo.apiVo.CostApiVO;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.server.api.IPropertyService;

@Controller
@RequestMapping("/propertyService")
public class PropertyController {
	@Autowired
	private IPropertyService iPropertyService;

	@RequestMapping(value = "/getAllProperty", method = { RequestMethod.GET })
	public @ResponseBody List<PropertyVo> getAllProperty(@ModelAttribute(value = "uid") String uid) {
		List<PropertyVo> list = iPropertyService.getAllProperty(uid);
		return list;
	}

	@RequestMapping(value = "/getCostByUid", method = { RequestMethod.GET })
	public @ResponseBody List<CostApiVO> getCostByUid(@ModelAttribute(value = "uid") String uid,@ModelAttribute(value = "costId") String costId) {
		return iPropertyService.getCostByUid(uid,costId);
	}
	
	@RequestMapping(value = "/updateCostStateByCostId", method = { RequestMethod.GET })
	public @ResponseBody SendStautsVo updateCostStateByCostId(@ModelAttribute(value = "costId") String costId) {
		return iPropertyService.updateCostStateByCostId(costId);
	}
}
