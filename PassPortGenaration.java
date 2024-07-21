class PassPortGenaration{
	static String cpvLoc;
	static String  dcdLoc;
	static String  gName;
	static String sName;
    static String  dob;
	static String  eml;
	static boolean  EmailLogin;
	static String logid;
	static String pwd;
	static String cnfrmpwd;
	static String hintQsn;
	static String hintAns;
	static String cpt; 

      public static boolean createPassPort(String cpvLocation,String dcdLocation,String givenName,String surName,String dateofbirth,String email,boolean isEmailLoginIsSame,String loginId,String password,String confirmPassword,String hintQussion,String hintAnswer ,String captha){
		  
	  boolean ispassportcreated=false;
	      cpvLoc=cpvLocation;
		   dcdLoc=dcdLocation;
		   gName=givenName;
		   sName=surName;
		    dob=dateofbirth;
		   eml=email;
		   EmailLogin=isEmailLoginIsSame;
		   logid=loginId;
		   pwd=password;
		   cnfrmpwd=confirmPassword;
		   hintQsn=hintQussion;
		 hintAns=hintAnswer;
		   cpt=captha;
		  
		  return ispassportcreated ;
}

		  
		  
public static void readPassPortDetails(){
			 
System.out.println("fetching the user details");
			  
 System.out.println("the user cpvLocation"+cpvLoc);
System.out.println("the user  dcdLocation"+dcdLoc);
System.out.println("the user givenName"+gName);
System.out.println("the user surName"+sName);
System.out.println("the user dob"+dob);
 System.out.println("the user email"+eml);
 System.out.println("the user isEmailLoginIsSame"+logid);
System.out.println("the user pwd"+pwd);
System.out.println("the user confirmPwd"+cnfrmpwd);
System.out.println("the user hintQsn"+hintQsn);
System.out.println("the user hintAns"+hintAns);
 System.out.println("the user captha"+cpt);
		  }
	  }

			
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		 