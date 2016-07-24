package www.tianfengSD.com.server.api;

import java.util.List;

import www.tianfengSD.com.Vo.HelpDetilVo;
import www.tianfengSD.com.Vo.HelpeVO;

public interface IHelpService {
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
	public List<HelpeVO> getHelpList(int nowPage,String userId,String type);
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
	
	
	/**
	 * 获取帮帮详情
	 * @param helpId
	 * @return
	 */
	public HelpeVO getHelpbyId(String helpId);
}
