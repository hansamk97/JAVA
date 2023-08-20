package file;


public class FileHelper2 {
	// 싱글톤
	private static FileHelper2 current;
	public static FileHelper2 getInstance() {
		if( current == null ) {
			current = new FileHelper2();
		}
		return current;
	}
	public static void freeInstance() {
	}
	
	// 파일 쓰기
	FileHelper2 writer = FileHelper2.getInstance();
	
	
	// 파일 읽기
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 주어진 경로에 data값을 기록하고 저장한다.
	/*
	 * param filePath	: 저장할 파일 경로
	 * param data		: 저장할 내용을 담을 스트림
	 * return boolean	: 성공시 true, 실패시 false
	 */
	
	// 주어진 경로에 파일을 읽고, 내용을 스트림으로 리턴
	/*
	 * param filePath	: 읽어야할 파일의 경로
	 * param byte[]		: 읽혀질 내용
	 * return boolean	: 성공시 true, 실패시 false
	 */
	
	// 파일 저장한다.
	/*
	 * param filePath	: 저장할 파일 경로
	 * param content	: 저장할 내용
	 * param encType	: 인코딩 형식
	 * return boolean	: 성공시 true, 실패시 false
	 */
}
