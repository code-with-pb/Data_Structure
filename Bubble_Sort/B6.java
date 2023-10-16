
public class B6 {
	public static void BB(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,5,6,4,1,2,9,7};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t;
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		BB(a);
	}
}
