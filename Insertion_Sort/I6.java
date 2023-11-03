
public class I6 {
	void cal(int a[]) {
		int i,j,t,n=a.length;
		for(i=0;i<n;i++) {
			t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		I6 o = new I6();
		int a[] = {20,5,11,2,59,63,55,40,22,60};
		o.cal(a);
	}
}
