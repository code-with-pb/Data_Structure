import java.util.*;

class Bbs1{
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Lis1 extends Bbs1{
	int s(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
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
		int i=s(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}

class Bis1 extends Bbs1{
	int s(int a[]) {
		int s=0,e=a.length-1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
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
		int i=s(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}

public class B22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,4,6,8,7,9};
		Bbs1 b = new Bbs1();
		Lis1 l = new Lis1();
		Bis1 bs = new Bis1();
		
		b.cal(a);
		b.show(a);
		l.s(a);
		l.show(a);
		
		b.cal(a);
		b.show(a);
		bs.s(a);
		bs.show(a);
		
	}

}
