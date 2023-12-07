
public class S24 {
	static void cal(int a[]) {
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
	}
	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {81,91,11,52,21,3,6,1,2,7,5,8};
		
		cal(a);
		show(a);
	}

}
