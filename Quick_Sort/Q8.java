
public class Q8 {
	static int partition(int a[],int l,int h) {
		int s = a[h];
		int i = (l-1);
		for(int j=l;j<h;j++) {
			if(a[j] <= s) {
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
			int k = partition(a,l,h);
			
			pivot(a,l,k-1);
			pivot(a,k+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {80,50,10,30,45};
		
		pivot(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}

}
