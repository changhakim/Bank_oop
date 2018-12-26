package service;

import domain.AccountBean;


/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스 
 */
public interface AccountService {

	public void createAccount (int money);

	public AccountBean[] accountList();
	public AccountBean[] findByName(String name);
	public AccountBean accountNumSearchById(String id);
	public int countAccount();
	public String today();
	

	public int deposit(int money);
	public int withDraw(int money);

	public void accountDelete(String accountNum);
}
