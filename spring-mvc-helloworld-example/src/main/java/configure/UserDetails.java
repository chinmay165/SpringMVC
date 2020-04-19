package configure;

public class UserDetails {

	private String name;
	private int empid;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*UserDetails(String name, int empid, String address){
		this.name = name;
		this.empid = empid;
		this.address = address;
	}*/
	
	public UserDetails getInfo() {
	
		//UserDetails ud = new UserDetails("Ram",101,"Pune");
		UserDetails ud = new UserDetails();
		ud.setName("LMS");
		ud.setEmpid(101);
		ud.setAddress("pune");
		
		//System.out.println(ud.getAddress());
		return ud;
		
		
	}
	
}
