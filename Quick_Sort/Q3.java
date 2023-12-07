
public class Q3 {
	public static int partition(int a[],int l,int h) {
		int v,i,j;
		v = a[h];
		i = (l-1);
		for(j=l;j<h;j++) {
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
	public static void pivot(int a[],int l, int h) {
		if(l<h) {
			int j = partition(a,l,h);
			pivot(a,l,j-1);
			pivot(a,j+1,h);
		}
	}
	public static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 8,2,5,9,3,7,6,4,10,25,36,20,1};
		pivot(a,0,a.length-1);
		show(a);
	}

}
