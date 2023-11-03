public class S13 {
	static int i,j;
	public static void get(int a[]) {
		for(i=0;i<a.length;i++) {
			int t = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
	}
	public static void show(int a[]) {
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,10,2,66,52,30,12,75,20,2,1};
		
		get(a);
		show(a);
	}

}
