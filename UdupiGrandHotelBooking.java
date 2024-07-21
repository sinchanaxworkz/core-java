class UdupiGrandHotelBooking{
        
		static String givenName ;
		static String midName ;
		static String surName ;
		static String add ;
		static String cit ;
		static String sta ;
		static String mailId ;
		static long mobileNumber ;
        
      public static boolean createUdupiGrandHotelBooking(String firstName, String middleName, String lastName, String address, String city, String state, String email, long phoneNumber){
	
	     boolean isUdupiGrandHotelBooking = false ;
		 givenName = firstName ;
		 midName = middleName ;
		 surName = lastName ;
		 add = address ;
		 cit = city ;
		 sta = state ;
		 mailId = email ;
		 mobileNumber = phoneNumber ;
		
		 
		 return isUdupiGrandHotelBooking ;
	
	}
    
	public static void readUdupiGrandHotelBookingDetails(){
	
	    System.out.println("fetching... hotel details...");
		System.out.println("The Restaurant Staff First Name is :" + givenName);
		System.out.println("The Staff Middle Name is :" + midName);
		System.out.println("The Staff Last Name is :" + surName);
		System.out.println("The Staff Address is :" + add);
		System.out.println("The Staff City is :" +cit);
		System.out.println("The Staff State is :" + sta);
		System.out.println("The Staff emailId is :" + mailId);
		System.out.println("The Staff Phone Number is :" + mobileNumber);
		
		
		
	
	}
}