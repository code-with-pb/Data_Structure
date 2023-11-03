
public class B12 {
	public static int i,j;
	public static void cal(int a[]) {
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public static void show(int a[]) {
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {7,8,9,5,6,4,2,1,6,10,21,12,30};
		cal(a);
		show(a);
	}
}
