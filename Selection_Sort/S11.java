
public class S11 {
	public static void cal(int a[]) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			int t = i;
			for(int j=i+1;j<n;j++) {
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
		int i,j,n=a.length;
		
		for(i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = {8,6,1,2,7,6,30,88,5,10};
		cal(a);
		show(a);
	}
}

/* 
 * for(i=0;i<a.length;i++) {
			int s = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[s]) {
					s = j;
				}
			}
			int t=a[s];
			a[s] = a[i];
			a[i] = t;
		}
 * */
