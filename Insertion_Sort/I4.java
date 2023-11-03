
public class I4 {
	void cal(int a[]) {
		int i,j,s;
		for(i=0;i<a.length;i++) {
			s = a[i];
			for(j=i-1;j>=0 && a[j] > s;j--) {
				a[j+1] = a[j];
			}
			a[j+1] = s;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a [] = {8,7,20,1,6,9,21,5};
		I4 o = new I4();
		o.cal(a);
	}
}
