package DTO;

public class MemberDTO {  // 순수 데이터만 가지는 클래스...였지
	private int studysiteMemberId;
	private String userId;
	private String userPassword;
	private String userEmail;
	private String userName;
	public MemberDTO() {}
	public MemberDTO(String userId, String userPassword, String userEmail, String userName) {
		this.userId=userId;
		this.userPassword=userPassword;
		this.userEmail=userEmail;
		this.userName=userName;
	}
	public MemberDTO(int id, String userId, String userPassword, String userEmail, String userName) {
		this(userId,userPassword,userEmail,userName);
		this.studysiteMemberId=id;
	}
	@Override
	public String toString() {
		return studysiteMemberId+","+userId+","+userPassword+","+userEmail+","+userName;
	}
	public int getStudysiteMemberId() {
		return studysiteMemberId;
	}
	public void setStudysiteMemberId(int studysiteMemberId) {
		this.studysiteMemberId = studysiteMemberId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
