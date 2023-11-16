import java.util.*;

class Get8{
	public static int k;
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter Key: ");
		k = sc.nextInt();
		System.out.println();
	}
}
class Ls8 extends Get8{
	int cal(int a[]) {
		int k = super.k;
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		
		return -1;
	}
	void show(int a[]) {
		System.out.println("Leaner Search: ");
		
		int i=cal(a);
		if(i==-1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
class Bs8 extends Get8{
	int cal(int a[]) {
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
	void show(int a[]) {
		System.out.println("Leaner Search: ");
		
		int i=cal(a);
		if(i==-1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
public class HI11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Get8 g = new Get8();
		
		g.get(a);
		
		//Ls8 l = new Ls8();
		//l
		Bs8 b  = new Bs8();
		b.show(a);
	}

}
