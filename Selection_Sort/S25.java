
public class S25 {
	static void S(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j = i+1;j<a.length;j++) {
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
		int a[] = {7,8,5,3,4,9,1,2};
		
		S(a);
	}

}
