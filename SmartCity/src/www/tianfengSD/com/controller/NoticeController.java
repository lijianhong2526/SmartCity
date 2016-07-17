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

import www.tianfengSD.com.Vo.NoticeVo;
import www.tianfengSD.com.server.api.INoticeService;

@Controller
@RequestMapping("/noticeService")
public class NoticeController {
	@Autowired
	private INoticeService iNoticeService;

	@RequestMapping(value = "/getNotice", method = { RequestMethod.POST })
	public @ResponseBody List<NoticeVo> getNotice(@RequestBody NoticeVo noticeVo, HttpServletRequest request,
			HttpServletResponse response) {
		return iNoticeService.getNotice(noticeVo);
	}
}
