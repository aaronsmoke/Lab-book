package Lab8;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	FileInputStream finput;
	FileOutputStream foutput;

	public CopyDataThread(FileInputStream finput, FileOutputStream foutput) {
	this.finput=finput;
	this.foutput=foutput;
	}
	
	@Override
	public void run() {
		int a=0;
		int count=1;

		while (a!=-1) {
			try {
				a = finput.read();
				foutput.write(a);
				count++;
			} catch (IOException ece) {
				ece.printStackTrace();
			}

			if (count % 10 == 0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				} catch (InterruptedException ece) {
					ece.printStackTrace();
				}
			}
		}

		try {
			finput.close();
			foutput.close();
		} catch (IOException ece) {
			ece.printStackTrace();
		}
	}
}
