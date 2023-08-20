package toy_membership;

import java.util.*;	// 끝을 *로 하면 java.util 패키지의 모든 클래스를 쓸 수 있다.

public class MemberHandler {
	
	private MemberInfo[] members;
	private int idx;

	public MemberHandler(int num){
		members = new MemberInfo[num];
		idx = 0;
	}

	public void memberInsert(){ //회원가입용 메서드
		
		String id, pw, name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		
		id = scanner.nextLine();
		
		if (!isUniqueID(id)) {	// 아이디가 중복되었으면
			System.out.println("이미 사용중인 아이디 입니다. \n");
			return;
		}
		
		System.out.print("암 호 : ");
		pw = scanner.nextLine();
		
		System.out.print("이 름 : ");
		name = scanner.nextLine();

		members[idx] = new MemberInfo(id, pw, name);
		idx++;
		
		System.out.println("가입 완료! \n");
	}

	private boolean isUniqueID(String id){ // 아이디의 중복 여부를 리턴
		if (idx == 0) {
			return true;
		}
		for (int i = 0 ; i < idx ; i ++) {
			if (members[i].getId().equals(id))
			{
				return false;
			}
		}
		return true;
	}

	public void memberLoginEx(){ // 회원로그인용 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : "); String id = scanner.nextLine();
		System.out.print("패스워드 : "); String pw = scanner.nextLine();

		for (int i = 0 ; i < idx ; i++)
		{
			if (members[i].getId().equals(id) && members[i].getPw().equals(pw))
			{
				System.out.println("환영합니다.");
				System.out.println("로그인에 성공하였습니다. \n");
				return;
			}else if (!members[i].getId().equals(id))
			{
				System.out.println("존재하지 않는 아이디입니다. \n");
				return;
			}
			else if (members[i].getId().equals(id) && !members[i].getPw().equals(pw))
			{
				System.out.println("암호가 잘못되었습니다. \n");
				return;
			}
		}
		// System.out.println("아이디와 비밀번호를 확인해주세요.");

		/*
		로그인 성공시 : "로그인 되었습니다." 메세지 출력
		로그인 실패시 : "존재하지 않는 아이디 입니다." or "암호가 잘못되었습니다." 중 하나를 출력
		*/
	}

	public void memberLogin(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : "); String id = scanner.nextLine();
		System.out.print("패스워드 : "); String pw = scanner.nextLine();
		String msg = "존재하지 않는 아이디 입니다.";

		for (int i = 0 ; i < idx ; i++ )
		{
			if (members[i].getId().equals(id)){// members배열에 입력한 아이디가 있으면
				if (members[i].getPw().equals(pw)){
					msg = "로그인 되었습니다.";
				} else{
					msg = "암호가 잘못되었습니다.";
				}
			}
		}
		System.out.println(msg);
	}
	
	
}
