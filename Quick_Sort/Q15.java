
public class Q15 {
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = (l-1);
		for(int j=l;j<h;j++) {
			if(a[j] <= v) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {85,65,95,75,45,15,25,35,59,58,57,54,52,51,53};
		
		pivot(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
