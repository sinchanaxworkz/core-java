class Movie{


static int childPrice=500;
static int adultPrice =childPrice+500;

public static void movieTicket(int age){
System.out.println("method started");

 if(age<18){
  System.out.println("The price of ticket is:" + childPrice );
 }
 else if(age>=18){
  System.out.println("The price of ticket is:" + adultPrice);
 }
System.out.println("method ended");
return ;

}


}