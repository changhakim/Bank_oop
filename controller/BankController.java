package controller;

import javax.swing.JOptionPane;

public class BankController {
	public void bank() {
		while(true) {
			switch(JOptionPane.showInputDialog("[은행메뉴]\n"
					+ "0.정지\n"
					+ "1.멤버서비스\n"
					+ "2.계좌서비스")) {
			
			case "0" :JOptionPane.showMessageDialog(null,"정지");
			case "1" : new MemberController().member();break;
			case "2" : new AccountController().account();break;
			}
		}
	}
}
