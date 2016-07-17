package www.tianfengSD.com.dao;

import java.util.List;

import www.tianfengSD.com.Vo.NoticeVo;

/**
 * 公告
 * @author Administrator
 *
 */
public interface INoticeDao {
	
	/**
	 * 获取公告
	 * @param noticeVo
	 * @return
	 */
	public List<NoticeVo> getNotice(NoticeVo noticeVo);
}
