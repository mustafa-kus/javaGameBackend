
public class Player {
	private int id;
	private String userName;
	private String nickName;
	private String password;
	private String firsName;
	private String lastName;
	private String nationalId;
	private int birthYear;
	private double creditValue;
	public Player() {
		this.id = 1000;
		this.userName = "Owner";
		this.nickName = "Owner";
		this.password = "Owner";
		this.firsName = "Owner";
		this.lastName = "Owner";
		this.nationalId = "000";
		this.birthYear = 1923;
		this.creditValue = 0;
		
	}
	public Player(int id, String userName, String nickName, String password, String firsName, String lastName,
			String nationalId, int birthYear, double creditValue) {
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
		this.password = password;
		this.firsName = firsName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
		this.creditValue = creditValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public double getCreditValue() {
		return creditValue;
	}
	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}
}
