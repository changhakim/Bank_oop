package service;

import domain.MemberBean;

/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 회원관리 서비스
 */
public interface MemberService {

	public void join(String name,String id,String pass,String ssn);


	public MemberBean[] memberList();
	public MemberBean[] findMemberByName(String name);
	public MemberBean findMemberByid(String id);
	public int countMember();
	public boolean existbyIdPass(String id,String pass);

	public void updatePassword(String id,String pass,String newpass);

	public void deleteMemberId(String id ,String pass);
}
