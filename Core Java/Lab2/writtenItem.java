package Lab2;

public abstract class writtenItem extends item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public writtenItem(int identificationNo, String title, int noOfCopies, String author) {
		super(identificationNo, title, noOfCopies);
		this.author = author;
		// TODO Auto-generated constructor stub
	}
	
}
