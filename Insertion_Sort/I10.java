
public class I10 {
	
	static int i,j;
	
	public static void cal(int a[]) {
		for(i=1;i<a.length;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	
	public static void show(int a[]) {
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int a[] = {10,5,9,3,6,2,7,1,8,4};
		
		cal(a);
		show(a);
	}
}
