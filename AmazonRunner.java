class AmazonRunner{
	
	public static void main(String[]ecommerce){
		
		System.out.println("Main Started");
		
		boolean isAmazonCreated = Amazon.createAmazonAccount("Sinchana shetty","shettysinchana@17gmail.com","shetty@321","shetty@321","13/02/2003","8876544480");
		if(isAmazonCreated == true)
	    Amazon.readAmazonAccount();

		System.out.println("Main ended");
	}
}
