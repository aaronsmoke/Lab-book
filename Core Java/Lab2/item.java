package Lab2;

public abstract class item {
	private int identificationNo;
	private String title;
	private int noOfCopies;
	public item(int identificationNo, String title, int noOfCopies) {
		super();
		this.identificationNo = identificationNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getIdentificationNo() {
		return identificationNo;
	}
	public void setIdentificationNo(int identificationNo) {
		this.identificationNo = identificationNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		if (identificationNo != other.identificationNo)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "item [identificationNo=" + identificationNo + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	public void print() {
		System.out.println("The identification no is "+ identificationNo);
		System.out.println("The title is "+ title);
		System.out.println("The no of copies is "+ noOfCopies);
	}
	public void checkIn() {
		noOfCopies--;
	}
	public void checkOut() {
		noOfCopies++;
	}
	public void addItem(int n, String s,int i) {
		setIdentificationNo(n);
		setTitle(s);
		setNoOfCopies(i);
		
	}
}
