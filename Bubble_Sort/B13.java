import java.util.*;

public class B13 {
	static int i,j;
	public static void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	public static void cal(int a[]) {
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public static void show(int a[]) {
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		get(a);
		cal(a);
		show(a);
		
	}
}
