package project;

public class MemberInfo {	// 한 명의 회원정보를 저정하기 위한 클래스
	private String id, pw, name;
	
	public MemberInfo(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public String getId(){
		return id; }
	
	public void setId(String id){
		this.id = id; }
	
	public String getPw(){
		return pw; }
	
	public void setPw(String pw){
		this.pw = pw; }
	
	public String getName(){
		return name; }
	
	public void setName(String name){
		this.name = name; }
	
	
	
}
