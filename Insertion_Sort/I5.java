
public class I5 {
	void xal(int a[]) {
		int i,j,t;
		int n = a.length;
		for(i=0;i<n;i++) {
			t = a[i];
			for(j=i-1;j>=0 && a[j] > t; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = t;
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[]= {8,21,5,1,3,9,6,7,30,11};
		I5 o = new I5();
		o.xal(a);
	}
}
