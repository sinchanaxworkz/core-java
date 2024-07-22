class LinkedlnRunner{
	
	public static void main(String[]job){
		
		System.out.println("Main Started");
		
		boolean isLinkedlnCreated =Linkedln.createLinkedlnAccount("Sinchana",null,"shetty@gmail.com","sinchu@123","sinchu@123","India","567451","Meta","SDE","5years","IT","BE in ISE");
		if(isLinkedlnCreated == true)
	    Linkedln.readLinkedlnAccount();

		System.out.println("Main ended");
	}

}
