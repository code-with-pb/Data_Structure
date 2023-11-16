import java.util.*;

class Get5{
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		int i,n=a.length;
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class Ls5 extends Get5{
	int cal(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
class Bbs5 extends Get5{
	int cal(int a[],int k) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int m = (s+e)/2;
			
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
}
public class HI9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		int v,k;
		
		Get5 g = new Get5();
		g.get(a);
		
		int i=0;
		
		do {
			System.out.print("Enter Choice: 1) 2): ");
			int j = sc.nextInt();
			
		
			switch(j) {
				case 1: Ls5 l = new Ls5();
						System.out.print("Enter Key: ");
						k = sc.nextInt();
						v=l.cal( a, k);
						if(v == -1) {
							System.out.println("Not Found: ");
						}
						else {
							System.out.println("Found at index: "+ v);
						}
						break;
				case 2: Bbs5 b = new Bbs5();
						System.out.print("Enter Key: ");
						k = sc.nextInt();
						v=b.cal( a, k);
						if(v == -1) {
							System.out.println("Not Found: ");
						}
						else {
							System.out.println("Found at index: "+ v);
						}
						break;
				default: System.out.println("Invalid Input...");
						  break;
			}
			i++;
		}while(i<3);
	}

}
