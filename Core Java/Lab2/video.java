package Lab2;

public class video extends mediaItem {
	private String director;
	private String genre;
	private int year;

	public video(int identificationNo, String title, int noOfCopies, int runtime, String director, String genre, int year) {
		super(identificationNo, title, noOfCopies, runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
		// TODO Auto-generated constructor stub
	}

}
