package www.tianfengSD.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import www.tianfengSD.com.Vo.HelpDetilVo;
import www.tianfengSD.com.Vo.HelpeVO;
import www.tianfengSD.com.Vo.returnVo.SendStautsVo;
import www.tianfengSD.com.server.api.IHelpService;

@Controller
@RequestMapping("/helpService")
public class HelpController {
	@Autowired
	private IHelpService iHelpService;
	@RequestMapping(value = "/getcount", method = { RequestMethod.GET })
	public @ResponseBody int getcount(HttpServletRequest request, HttpServletResponse response) {
		return iHelpService.getcount();
	}
	
	/**
	 * 获取帮帮列表
	 * @param nowPage
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getHelpList", method = { RequestMethod.GET })
	public @ResponseBody List<HelpeVO> getHelpList(@ModelAttribute(value = "nowPage") int nowPage,
			@ModelAttribute(value = "userId") String userId,@ModelAttribute(value = "type") String type, HttpServletRequest request, HttpServletResponse response) {
		return iHelpService.getHelpList(nowPage,userId,type);
	}
	
	/**
	 * 获取帮帮详细情
	 * @param helpId
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getHelpbyId", method = { RequestMethod.GET })
	public @ResponseBody HelpeVO getHelpbyId(@ModelAttribute(value = "helpId") String helpId, HttpServletRequest request,
			HttpServletResponse response) {
		return iHelpService.getHelpbyId(helpId);
	}

	@RequestMapping(value = "/insertHelp", method = { RequestMethod.POST })
	public @ResponseBody SendStautsVo insertHelp(@RequestBody HelpeVO vo, HttpServletRequest request, HttpServletResponse response) {
		SendStautsVo returnVO = new SendStautsVo();
		try {
			iHelpService.insertHelp(vo);
			returnVO.setCode("300");
			returnVO.setMsg("success");
		} catch (Exception e) {
			returnVO.setCode("301");
			returnVO.setMsg("error" + e);
		}
		return returnVO;
	}


	@RequestMapping(value = "/insertHelpDetil", method = { RequestMethod.POST })
	public @ResponseBody SendStautsVo insertHelpDetil(@RequestBody HelpDetilVo vo, HttpServletRequest request, HttpServletResponse response) {
		SendStautsVo returnVO = new SendStautsVo();
		try {
			iHelpService.insertHelpDetil(vo);
			returnVO.setCode("300");
			returnVO.setMsg("success");
		} catch (Exception e) {
			returnVO.setCode("301");
			returnVO.setMsg("error" + e);
		}
		return returnVO;
	}
}
