
public class B11 {
	public static void cal(int a[]) {
		int i,j,n=a.length;
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t=a[j];
					a[j] = a[j+1];
					a[j+1]= t;
				}
			}
		}
	}
	public static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,7,5,1,6,9,2};
		cal(a);
		show(a);
	}
}
