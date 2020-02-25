package Lab2;

public class cd extends mediaItem{
	private String artist;
	private String genre;
	
	public cd(int identificationNo, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(identificationNo, title, noOfCopies, runtime);
		this.artist=artist;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}

}
