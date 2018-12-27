package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//CREATE
	public void join(String name,String pass,String auth); 
	//READ	
	/*public ArrayList<AdminBean> adminList();//findAll
	public ArrayList<AdminBean> findByauth(String auth);//findSome
*/	
	
	public ArrayList<AdminBean> adminList();//findAll
		
	public ArrayList<AdminBean> findByauth(String auth);//findSome
	public AdminBean findByAdminNum(String adminNum);//findOne
	public int countAdmin();
	public boolean existbyAdmin(String adminNum,String pass); //로그인
	//UPDATE
	public void updatePassword(String adminNum,String pass,String newpass);//비밀번호변경
	public void updateAuth(String adminNum,String auth); //직급변경
	//DELETE
	public void deleteId(String adminNum,String pass);
}
