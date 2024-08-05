
class SocialMedia{

    int socialMediaId;
	String socialMediaName;
	String profileName;
	String emailId;


public SocialMedia(int socialMediaId,String socialMediaName,String profileName,String emailId){
	
    this.socialMediaId =  socialMediaId ;  
	 this.socialMediaName= socialMediaName;
	 this.profileName= profileName;
     this.emailId = emailId;	
	
}
public void displayInfo(){
	System.out.println("Social Media Account Generated");
		System.out.println("Social Media Id is " + this.socialMediaId);
		System.out.println("Social Media Name is " + this.socialMediaName);
		System.out.println("Profile Name is " + this.profileName);
		System.out.println("Email Id is " + this.emailId);
	
	
	
	
	
}
}
