
public class S5 {
	public static void B(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,1,2,5,4,3,6,9,7};
		int i,j;
		
		for(i=0;i<a.length;i++) {
			int sm = i;
			for(j=i+1;j<a.length;j++) {
				if(a[sm] > a [j]) {
					sm = j;
				}
			}
			int t = a[sm];
			a[sm] = a[i];
			a[i] = t;
		}
		B(a);
	}
}
