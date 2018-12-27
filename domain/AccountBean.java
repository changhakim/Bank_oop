package domain;

/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 은행계좌Bean객체 
 */
public class AccountBean {
	private String accountNum,today;
	private int money;
	final  static  String BANK_NAME = "신한";
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("계좌번호:%s%s\n"
				+ "개설날짜%s\n"
				+ "잔액:%d\n",BANK_NAME,accountNum,today,money );
	}

	
}
