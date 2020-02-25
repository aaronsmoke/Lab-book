package Lab7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Excercise8 {
static Integer[] modifyArray(Integer a[])
{
	
		Arrays.sort(a,Collections.reverseOrder());
		return a;
}
public static void main(String[] args) {
	Integer []ar= {123,123,123,124,5355,35,143,124};
	for(Integer i:Excercise8.modifyArray(ar))
		System.out.println(i+" ");
}
}
