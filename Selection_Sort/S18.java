
public class S18 {
	static void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {88,99,66,44,22,11,7,5,56,65,35,15,21,78};
		
		cal(a);
	}

}
