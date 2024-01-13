
public class Q17 {
	static int partition(int a[],int l, int h) {
		int v = a[h];
		int i = l-1;
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
	static void pivot(int a[], int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	static void show(int a[]) {
		pivot(a,0, a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,9,8,3,1,6,4};
		
		show(a);
	}

}
