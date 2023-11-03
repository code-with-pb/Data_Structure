
public class I13 {
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {42,5,1,3,5,2,66,12,32,25,21};
		
		cal(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
