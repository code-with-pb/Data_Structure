import java.util.*;

public class B23 {
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		B23 b = new B23();
		b.get(a);
		b.cal(a);
	}

}
