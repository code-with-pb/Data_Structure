import java.util.*;

class gk{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class ck extends gk{
	void cal(int a[]) {
		int i,j,n=a.length;
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
}
class sk extends ck{
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class I16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		sk o = new sk();
		o.get(a);
		o.cal(a);
		o.show(a);
	}

}
