import java.util.Scanner;

public class I7 {
	public static void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int t=a[i];
			j=i-1;
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
	public static void main (String args[]) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array: ");
		int a[] = new int[5];
		for(i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		cal(a);
		show(a);
	}
}
