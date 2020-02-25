package Lab2;

public abstract class mediaItem extends item {
	private int runtime;
	public mediaItem(int identificationNo, String title, int noOfCopies, int runtime) {
		super(identificationNo, title, noOfCopies);
		this.runtime=runtime;
		// TODO Auto-generated constructor stub
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
}
