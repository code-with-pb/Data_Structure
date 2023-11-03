import java.util.*;

class Gs{
	void g(int a[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
 		}
	}
}
class cc extends Gs{
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
	}
}

class sp extends cc{
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class B17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		sp o = new sp();
		o.g(a);
		o.cal(a);
		o.show(a);
		
	}

}
