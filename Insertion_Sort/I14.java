
public class I14 {
	static void cal(int a[]) {
		int i,j,n=a.length;
		for(i=0;i<n;i++) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {51,20,1,3,52};
		cal(a);
	}

}
