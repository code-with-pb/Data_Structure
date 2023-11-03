
public class S15 {
	static void cal(int a[]) {
		int i,j,t;
		for(i=0;i<a.length;i++) {
			t = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,2,1,3}; 
		cal(a);
	}

}
