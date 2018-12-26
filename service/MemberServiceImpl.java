package service;

import domain.MemberBean;

/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 멤버기능구현객체 
 */
public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;

	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}


	@Override
	public void join(String name, String id, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setName(name);
		member.setId(id);
		member.setPass(pass);
		member.setSsn(ssn);

		members[count] = member;
		count++;


	}

	@Override
	public MemberBean[] memberList() {

		return members;
	}

	@Override
	public MemberBean findMemberByid(String id) {
		MemberBean member = new MemberBean();
		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
			}
		}

		return member;
	}
	@Override
	public MemberBean[] findMemberByName(String name) {
		MemberBean[] members1 = new MemberBean[10];
		
		return members1;
	}


	@Override
	public boolean existbyIdPass(String id, String pass) {
		boolean ok = false;	

		for(int i =0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
			}
		}
		return ok;
	}

	@Override
	public int countMember() {

		return count;
	}

	@Override
	public void updatePassword(String id, String pass, String newpass) {

		for(int i =0; i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i].setPass(newpass);
			}
		}

	}

	@Override
	public void deleteMemberId(String id,String pass) {
		// TODO Auto-generated method stub

	}


	




}
