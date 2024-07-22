
class SpotifyRunner{
	
	public static void main(String[]music){
		
		System.out.println("Main Started");
		
		boolean isSpotifyCreated = Spotify.createSpotifyAccount("sinchana",null,"9887633401","uoipo","13/02/2003");
		if(isSpotifyCreated == true)
		Spotify.readSpotifyAccount();
		
		System.out.println("Main ended");
	}

}
