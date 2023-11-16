import java.util.*;

public class Bs5 {
	static void get(int a[]) {
		System.out.print("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int cal(int a[],int k) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int m= (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
	static void show(int a[]) {
		System.out.print("Enter Key: ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		int i=cal(a,k);
		if(i == -1) {
			System.out.println("Not Found....");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		get(a);
		show(a);
	}

}
