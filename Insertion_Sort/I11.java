import java.util.*;

public class I11 {
	
	static int i,j,n=8;
	
	public static void get(int a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Element: ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Unsorted Array: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void cal(int a[]) {
		for(i=0;i<n;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
				
			}
			a[j+1] = t;
		}
	}
	
	public static void show(int a[]) {
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[8];
		
		get(a);
		cal(a);
		show(a);
	}

}
