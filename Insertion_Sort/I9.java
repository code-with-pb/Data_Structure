
public class I9 {
	public static void cal(int a[]) {
		int i,j,n=a.length;
		
		for(i=0;i<n-1;i++) {
			int t = a[i];
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
		int a []= {8,22,13,28,54,63,10,30};
		cal(a);
	}
}
