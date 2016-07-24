package www.tianfengSD.com.server.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.tianfengSD.com.Vo.HelpDetilVo;
import www.tianfengSD.com.Vo.HelpeVO;
import www.tianfengSD.com.dao.IHelpDao;
import www.tianfengSD.com.server.api.IHelpService;

@Service
@Transactional
public class HelpService implements IHelpService {
	@Resource
	private IHelpDao iHelpDao;
	
	@Override
	public int getcount() {
		return iHelpDao.getcount();
	}

	@Override
	public List<HelpeVO> getHelpList(int nowPage,String userId,String type) {
		nowPage=(nowPage-1)*10;
		Map param=new HashMap();
		param.put("nowPage", nowPage);
		param.put("userId", String.valueOf(userId));
		param.put("type", String.valueOf(type));
		return iHelpDao.getHelpList(param);
	}

	@Override
	public void insertHelp(HelpeVO vo) {
		iHelpDao.insertHelp(vo);
	}

	@Override
	public void insertHelpDetil(HelpDetilVo vo) {
		iHelpDao.insertHelpDetil(vo);
	}

	@Override
	public HelpeVO getHelpbyId(String helpId) {
		HelpeVO vo=iHelpDao.getHelpVoById(helpId);
		if(vo!=null){
			vo.setHelpDetiList(iHelpDao.getHelpDetilById(helpId));
			return vo;
		}
		return null;
	}

}
