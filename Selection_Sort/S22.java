import java.util.*;

class ss1{
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class ls1 extends ss1{
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

class bs1 extends ss1{
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
public class S22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,2,5,4,6,9,8,7};
		ss1 s = new ss1();
		ls1 l = new ls1();
		bs1 b = new bs1();
		
		s.cal(a);
		s.show(a);
		l.cal(a);
		l.show(a);
		
		s.cal(a);
		s.show(a);
		b.cal(a);
		b.show(a);
	}

}
