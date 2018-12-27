package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService {
	private HashMap<String,AdminBean> map;
	private int seq;
	public AdminServiceImpl() {
		map = new HashMap<>();
		seq = 0;
	}
	@Override
	public void join(String name,  String pass, String auth) {
		AdminBean admin = new AdminBean();
		admin.setAdminNum(String.valueOf(seq));
		admin.setAuth(auth);//staff 사원
		admin.setName(name);
		admin.setPass(pass);
		map.put(admin.getAdminNum(),admin);//키값으로 한방에 찾는다 저장장소는 맵이빠르다.키값은 중복x
		seq++;
		
	}

	@Override
	public ArrayList<AdminBean> adminList() {
		
		return (ArrayList<AdminBean>) map.values();
		
	}

	@Override
	public ArrayList<AdminBean> findByauth(String auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean findByAdminNum(String adminNum) {
		
		return map.get(adminNum);
	}

	@Override
	public int countAdmin() {
		// TODO Auto-generated method stub
		return map.size();
	}

	@Override
	public boolean existbyAdmin(String adminNum, String pass) {
		boolean exist = false;
		if(map.containsKey(adminNum)&& map.get(adminNum).getPass().equals(pass)) {
			exist = true;
		}
		return true;//키값이 맵에 있냐
	}

	@Override
	public void updatePassword(String adminNum, String pass, String newpass) {
		
		if(map.get(adminNum).getPass().equals(pass)) {
			map.get(adminNum).setPass(newpass);
		}
		
	}

	@Override
	public void updateAuth(String adminNum, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteId(String adminNum, String pass) {
		map.remove(adminNum);
		
	}

}
