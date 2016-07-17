package www.tianfengSD.com.server.api;

import java.util.List;

import www.tianfengSD.com.Vo.NoticeVo;

public interface INoticeService {
	/**
	 * 
	 * @param noticeVo
	 * @return
	 */
	public List<NoticeVo> getNotice(NoticeVo noticeVo);
}
