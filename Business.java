/*
	Josiah Brooks
	10/21/2018
	Vehicle and add Method a8
*/


class Business {
	String first_name;
	String last_name;
	String phone;
	String email;
	
	Business(String first_name, String last_name, String phone, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email = email;
	}
	
	public void contactName(){
	System.out.println("Contact Name: " + first_name + " " + last_name);
	}
	
	public void contactInfo() {
		System.out.println("Contact Info: " + phone + " " + email); 
	}
}	
	
class Employee {	
	public static void main(String arg[]) {
		Business employee1 = new Business("Josiah", "Brooks", "706-614-1421", "josiahbrooks23@gmail.com");
		Business employee2 = new Business("Justin", "Brooks", "706-324-9842", "justinbrooks1@gmail.com");
		Business employee3 = new Business("Sadie", "Bailey", "499-473-1234", "sad39@gmail.com");
		Business employee4 = new Business("Faith", "Lewis", "648-248-7484", "Yellfr32@yahoo.com");
		Business employee5 = new Business("Jake", "Black", "492-098-7620", "Blacksu@gmail.com");
		Business employee6 = new Business("Gabby", "Christian", "223-372-3742", "Cgabby8@gmail.com");
		Business employee7 = new Business("Hao", "Shu", "324-390-9032", "shu@gmail.com" );
		Business employee8 = new Business("Hannah", "Sing", "918-423-7862", "Hannah@yahoo.com");
		Business employee9 = new Business("Sandra", "High", "749-244-4844", "Shigh@gmail.com");
		Business employee10 = new Business("Cam", "Dan", "521-532-984", "Camtheman@gmail.com");
		
		employee1.contactName();
		employee1.contactInfo();
		employee2.contactName();
		employee2.contactInfo();
		employee3.contactName();
		employee3.contactInfo();
		employee4.contactName();
		employee4.contactInfo();
		employee5.contactName();
		employee5.contactInfo();
		employee6.contactName();
		employee6.contactInfo();
		employee7.contactName();
		employee7.contactInfo();
		employee8.contactName();
		employee8.contactInfo();
		employee9.contactName();
		employee9.contactInfo();
		employee10.contactName();
		employee10.contactInfo();
	}
	
}
