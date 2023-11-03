
public class S12 {
	public static int i,j;
	
	public static void cal(int a[]) {
		for(i=0;i<a.length;i++) {
			int t = i;
			for(j=i+1;j<a.length;j++) {
				if(a[t] > a[j]) {
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
	
	public static void main(String args[]) {
		int a[] = {8,1,9,7,2,3,6,4,5,15,10};
		
		cal(a);
		show(a);
		
	}
}
