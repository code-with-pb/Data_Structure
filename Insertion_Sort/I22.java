
public class I22 {
	static void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {84,52,1,5,42,65,77,82,14,12};
		
		cal(a);
	}

}
