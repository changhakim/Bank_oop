package service;

import java.util.ArrayList;

import domain.AccountBean;


/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스 
 */
public interface AccountService {
	//Create
	public void createAccount (int money);
	public String createAccountNum();
	
	// Read
	public ArrayList<AccountBean> findAll();
	public AccountBean accountNumSearchById(String id);
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public String findDate();//날짜반환
	
	

	public void deposit(String accountNum ,int money);
	public void withDraw(String accountNum ,int money);

	public void accountDelete(String accountNum);
}
