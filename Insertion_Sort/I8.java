
public class I8 {
	public static void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	public static void display(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,1,2,9,3,4,7,5,6,10};
		cal(a);
		display(a);
	}
}
