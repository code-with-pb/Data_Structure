
public class Q16 {
	static int partition(int a[],int l,int h) {
		int v= a[h];
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
		int a[]= {100,99,88,77,66,55,44,11,22,33,1,2,3,4,5,6,7,8,9};
		
		pivot(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
