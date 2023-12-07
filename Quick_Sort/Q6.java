
public class Q6 {
	static int partition(int a[],int l,int h) {
		int t = a[h];
		int i = l-1;
		for(int j=l;j<h;j++) {
			if(a[j] <= t) {
				i++;
				
				int s = a[i];
				a[i] = a[j];
				a[j] = s;
			}
		}
		int s = a[i+1];
		a[i+1] = a[h];
		a[h] = s;
		
		return i+1;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int k = partition(a,l,h);
			pivot(a,l,k-1);
			pivot(a,k+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,5,2,3,6,8,7,9,1};
		
		pivot(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
