package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class MemberController {
	public  void member() {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		MemberBean[] members = null;
		AccountService accountService = new AccountServiceImpl(); 
		while(true) {
			switch(JOptionPane.showInputDialog("[멤버서비스]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.회원리스트\n"
					+ "3.회원정보찾기\n"
					+ "4.회원로그인\n"
					+ "5.비밀번호변경\n"
					+ "6.회원수\n"
					+ "7.동일이름\n"
					)) {


					case "0" : JOptionPane.showMessageDialog(null,"정지...");return;
					case "1" : 

						service.join(JOptionPane.showInputDialog("이름을 입력하세요"),
								JOptionPane.showInputDialog("아이디를 입력하세요"),
								JOptionPane.showInputDialog("비밀번호를 입력하세요"), 
								JOptionPane.showInputDialog("주민등록번호를 입력하세요"));
						break;
					case "2" :
						members = service.memberList();
						JOptionPane.showMessageDialog(null,members);
						break;
					case "3" :
						JOptionPane.showMessageDialog(null,service.findMemberByid(JOptionPane.showInputDialog("아이디를 입력하세요")));
						break;
					case "4" :

						if(service.existbyIdPass(JOptionPane.showInputDialog("아이디를 입력하세요"),
								JOptionPane.showInputDialog("비밀번호 입력"))) {
							JOptionPane.showMessageDialog(null,"로그인 성공");
						}else {
							JOptionPane.showMessageDialog(null,"로그인 실패");
						}
						break;

					case "5" : 

						service.updatePassword(JOptionPane.showInputDialog("아이디를 입력해주세요"),
								JOptionPane.showInputDialog("현재 비밀번호를 입력해주세요"), 
								JOptionPane.showInputDialog("바꿀 비밀번호를 입력해주세요"));
						JOptionPane.showMessageDialog(null,"비밀번호가 변경되었습니다.");
						break;
					case "6" :
						JOptionPane.showMessageDialog(null,String.format("%d명",service.countMember()));
						break;
					case "7" :
						
						JOptionPane.showMessageDialog(null,service.findMemberByName(JOptionPane.showInputDialog("이름을 입력하세요")));break;
					
					
			}
		}
	}
}
