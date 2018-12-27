package controller;

import javax.swing.JOptionPane;

import service.AccountService;
import service.AccountServiceImpl;

public class AccountController {
	public void account() {
		AccountService accountService = new AccountServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[계좌메뉴]\n"
					+ "0.정지\n"
					+ "1.계좌생성\n"
					+ "2.계좌리스트\n"
					+ "3.계좌찾기\n"
					+ "4.계좌입금\n"
					+ "5.계좌출금\n"
					+ "6.계좌지우기")) {
					case "0" : JOptionPane.showMessageDialog(null,"정지");return;
					case "1" :
						accountService.createAccount(Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하세요")));
						break;
					case "2" :

						JOptionPane.showMessageDialog(null, accountService.findAll());break;
					case "3" : 

						JOptionPane.showMessageDialog(null,accountService.findByAccountNum(JOptionPane.showInputDialog("찾을 계좌를 입력하세요")) );
						break;
					case "4" :	
						accountService.deposit(JOptionPane.showInputDialog("입금하실 계좌번호를입력하세요"),
								Integer.parseInt(JOptionPane.showInputDialog("입금액을 입력하세요")));break;
					case "5":
						accountService.withDraw(JOptionPane.showInputDialog("입금하실 계좌번호를입력하세요"),
								Integer.parseInt(JOptionPane.showInputDialog("입금액을 입력하세요")));break;
					case "6":
						accountService.accountDelete(JOptionPane.showInputDialog("지우실 계좌를 입력하세요"));break;
			}
		}

	}
}
