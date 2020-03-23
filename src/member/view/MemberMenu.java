package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		do {
			System.out.println("========== ȸ�� ���� �޴� ==========");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : mm.insertMember(); break;
			case 2 : searchMemberMenu(); break;
			case 3 : updateMemberMenu(); break;
			case 4 : deleteMemberMenu(); break;
			case 5 : mm.printAllMember(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
				default : System.out.println("�ٽ� �Է��ϼ���."); break;
			}
			
		} while(true);
	}

	private void deleteMemberMenu() {
		// TODO Auto-generated method stub
		
	}

	private void updateMemberMenu() {
		// TODO Auto-generated method stub
		
	}

	private void searchMemberMenu() {
		// TODO Auto-generated method stub
		
	}
}
