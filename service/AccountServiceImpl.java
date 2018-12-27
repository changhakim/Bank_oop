package service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import domain.AccountBean;

/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현 객체
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	/********************************
	 CREATE
	 * ********************************/
	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		list.add(account);

	}
	@Override
	public String createAccountNum() {
		String countNum = "";
		Random random = new Random();
		int[] a = new int[3]; 
		for(int i =0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			countNum +=a[i];
		}

		return countNum;
	}

	/********************************
	 READ
	 * ********************************/
	@Override
	public ArrayList<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return list;
	}	
	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public String findDate() {
		String fdate = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		fdate = sdf.format(date);
		return fdate;
	}




	@Override
	public AccountBean accountNumSearchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return list.size();
	}



	@Override
	public void deposit(String accountNum ,int money) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMoney(list.get(i).getMoney()+money);
				break;
			}
		}

	}

	@Override
	public void withDraw(String accountNum, int money) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.get(i).setMoney(list.get(i).getMoney()-money);
				break;
			}
		}

	}

	@Override
	public void accountDelete(String accountNum) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.remove(i).setAccountNum(accountNum);
				break;
			}
		}

	}





}
