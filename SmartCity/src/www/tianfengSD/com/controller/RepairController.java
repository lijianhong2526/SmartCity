package www.tianfengSD.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Vo.RepairVo;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.server.api.IRepairService;

@Controller
@RequestMapping("/repairService")
public class RepairController {
	@Autowired
	private IRepairService iRepairService;

	@RequestMapping(value = "/addRepair", method = { RequestMethod.POST })
	public @ResponseBody SendStautsVo addRepair(@RequestBody RepairVo repairVo) {
		return iRepairService.AddRepair(repairVo);
	}

}
