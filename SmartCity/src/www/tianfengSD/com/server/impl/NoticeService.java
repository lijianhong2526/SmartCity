package www.tianfengSD.com.server.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.tianfengSD.com.Vo.NoticeVo;
import www.tianfengSD.com.dao.INoticeDao;
import www.tianfengSD.com.server.api.INoticeService;

@Service
@Transactional
public class NoticeService implements INoticeService {
	@Resource
	private INoticeDao inoticeDao;

	@Override
	public List<NoticeVo> getNotice(NoticeVo noticeVo) {
		List<NoticeVo> list = new ArrayList<NoticeVo>();
		try {
			list = inoticeDao.getNotice(noticeVo);
			return list;
		} catch (Exception e) {
		}
		return list;
	}

}
