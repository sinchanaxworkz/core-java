
class MeeshoCreateAccountRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		MeeshoCreateAccount.createUserAccount("Sinchana", "Shetty", 9686211563L, "Shetty@gmail.com", "sinchu@321", "Sinchu@321");
		MeeshoCreateAccount.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}
