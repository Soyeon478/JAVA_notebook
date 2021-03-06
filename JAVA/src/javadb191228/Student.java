package javadb191228;

public class Student {
	
	private int studentNo;
	private String name;
	private int age;
	private String address;
	private String gender;
	private String phone;
	
	@Override
	public String toString() {
		return "Student [학생번호=" + studentNo + ", 학생이름=" + name + ", 학생나이=" + age + ", 학생주소=" + address
				+ ", 학생성별=" + gender + ", 학생전화번호=" + phone + "]";
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
