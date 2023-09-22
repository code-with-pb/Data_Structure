import java.util.*;

public class S3 {
	void A() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1;i++) {
			int s = i;
			for(int j=i+1;j<n;j++) {
				if(a[s] > a[j]) {
					s = j;
				}
			}
			int t = a[s];
			a[s] = a[i];
			a[i] = t;
		}
		for(int i=0; i<n-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S3 o = new S3();
		o.A();
	}

}
