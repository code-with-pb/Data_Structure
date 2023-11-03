
public class M3 {
	public static void conquer(int a[], int l,int m, int u) {
		int a1 [] = new int[(u-l+1)];
		
		int i,j,k;
		
		i=l;
		j = m+1;
		k=0;
		
		while(i<=m && j<=u) {
			if(a[i] < a[j]) {
				a1[k] = a[i];
				k++;
				i++;
			}
			else {
				a1[k] = a[j];
				k++;
				j++;
			}
		}
		while(i<=m) {
			a1[k] = a[i];
			k++;
			i++;
		}
		while(j<=u) {
			a1[k] = a[j];
			k++;
			j++;
		}
		for(i=l,j=0;i<=u;i++,j++) {
			a[i] = a1[j];
		}
	}
	public static void devide(int a[],int i,int j) {
		if(i<j) {
			int k = (i+j) / 2;
			
			devide(a,i,k);
			devide(a,k+1,j);
			conquer(a,i,k,j);
		}
	}
	public static void main(String args[]) {
		int a[] = {11,55,2,78,41,56,36,96,20,1};
		
		int n = a.length;
		
		devide(a,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
