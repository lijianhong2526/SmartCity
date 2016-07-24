package www.tianfengSD.com.dao;

import java.util.List;
import java.util.Map;

import www.tianfengSD.com.Vo.HelpDetilVo;
import www.tianfengSD.com.Vo.HelpeVO;

/**
 * 帮帮
 * 
 * @author Administrator
 *
 */
public interface IHelpDao {
	/**
	 * 获取帮帮总数
	 * 
	 * @return
	 */
	public int getcount();

	/**
	 * 获取帮助列表
	 * @param nowPage 当前页面
	 * @return
	 */
	public List<HelpeVO> getHelpList(Map param);

	/**
	 * 获取办帮帮数据
	 * @param helpId
	 * @return
	 */
	public HelpeVO getHelpVoById(String helpId);

	/**
	 * 获取捐款数据
	 * @param helpId
	 * @return
	 */
	public List<HelpDetilVo> getHelpDetilById(String helpId);
	
	/**
	 * 发布帮帮
	 * @param vo
	 */
	public void insertHelp(HelpeVO vo);
	
	/**
	 * 添加捐款数据
	 * @param vo
	 */
	public void insertHelpDetil(HelpDetilVo vo);
}
