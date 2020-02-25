package Lab2;

public class journal extends writtenItem {
	private int year;
	public journal(int identificationNo, String title, int noOfCopies, String author,int year) {
		super(identificationNo, title, noOfCopies, author);
		this.year =year;
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
