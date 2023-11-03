import java.util.*;

public class I12 {
	public static void cal(int a[]) {
		for(int i=1;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	public static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {20,1,30,50,4,6,80,10,21,35};
		cal(a);
		show(a);
	}
}
