import java.util.*;

public class L8 {
	static void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int cal(int a[],int k) { 
		 int i=0;
		 while(i<a.length) {
			 if(a[i] == k) {
				 return i;
			 }
			 i++;
		 }
		 return -1;
	}
	static void show(int a[]) {
		int k;
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Key: ");
		 k = sc.nextInt();
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
