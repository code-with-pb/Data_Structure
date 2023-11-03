import java.util.Scanner;

class gp{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class cp extends gp{
	void cal(int a[]) {
		int i,j,n = a.length;
		for(i=0;i<n;i++) {
			int t = i;
			for(j=i+1;j<n-1;j++) {
				if(a[t] > a[j]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
}
class Sp extends cp{
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class S17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.print("Enter Length: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		sp o = new sp();
		o.g(a);
		o.cal(a);
		o.show(a);
	}

}
