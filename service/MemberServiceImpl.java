package service;

import domain.MemberBean;

/**
 * @author Kim Chang-Ha
 * @date 2018. 12. 26.
 * @desc 멤버기능구현객체
 */
public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count, equl;

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
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id)) {
				member = members[i];
			}
		}

		return member;
	}

	@Override
	public int findSomeCount(String name) {
		int a = 0;
		for (int i = 0; i < count; i++) {
			if (members[i].getName().equals(name)) { // 메소드로 넣으면 더 빠를까?
				a++;
			}
		}
		return a;
	}

	@Override
	public MemberBean[] findMemberByName(String name) {

		MemberBean[] members1 = new MemberBean[findSomeCount(name)];
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (members[i].getName().equals(name)) {
				members1[j] = members[i];
				j++;
				if (j == members1.length) {
					break;
				}
			}
		}

		return members1;
	}

	@Override
	public boolean existbyIdPass(String id, String pass) {
		boolean ok = false;

		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
				break;
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

		for (int i = 0; i < count; i++) {
			if (existbyIdPass(id, pass)) {
				members[i].setPass(newpass);
				break;
			}
		}

	}

	@Override
	public void deleteMemberId(String id, String pass) {
		for (int i = 0; i < count; i++) {
			if (existbyIdPass(id, pass)) {
				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;
				break;
			}
		}

	}

}
