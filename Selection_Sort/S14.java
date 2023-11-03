
public class S14 {
	public static void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int t=i;
			for(j=i+1;j<a.length;i++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,3,2,74,52,32,12,10};
		cal(a);
		show(a);
	}

}
