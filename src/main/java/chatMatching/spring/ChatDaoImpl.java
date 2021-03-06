package chatMatching.spring;

import java.util.List;

import chatMatching.vo.ChatVo;
import employerBoard.vo.EmployerBoardVO;
import workerBoard.vo.WorkerBoardVO;

public interface ChatDaoImpl{
	
	public void insertChatOne2(String userCode, String fromCode, String toCode, String chatContent, String readCheck);
	public ChatVo selectChatOne2(String fromCode, String toCode);
	public void updateReadCheck2(String fromCode, String toCode);
	public List<ChatVo> selectOneChatList2(String fromCode, String toCode);
	public int selectAllReadCount2(String myUserCode);
	public int selectReadCount2(String fromCode, String toCode);
	public List<ChatVo> selectAllChatList2(String myUserCode);
	public void deleteChat2(String myuserCode, String fromCode);
	public String selectSmsCheck2(String myuserCode);
	public void insertMatching2(String myuserCode, String employeeCode, String ebCode,
			String groupID);
	public List<WorkerBoardVO> selectWb(String writerCode);
	public List<EmployerBoardVO> selectEb(String writerCode);
}
