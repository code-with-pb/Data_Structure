
public class I17 {
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
		int a[] = { 85,99,25,35,15,65,45,75,85,95,1,2,3,4,5,6,7,8,9};
		
		cal(a);
	}

}
