
public class M2 {
	public static void conquer(int a[],int l,int m,int u) {
		int merge[] = new int[(u-l+1)];
		
		int i,j,k;
		i = l;
		j = m+1;
		k = 0;
		
		while(i<=m && j <= u) {
			if(a[i] < a[j]) {
				merge[k] = a[i];
				k++;
				i++;
			}
			else {
				merge[k] = a[j];
				k++;
				j++;
			}
		}
		while(i<=m) {
			merge[k] = a[i];
			k++;
			i++;
		}
		while(j<=u) {
			merge[k] = a[j];
			k++;
			j++;
		}
		for(i=l,j=0;i<=u;i++,j++) {
			a[i] = merge[j];
		}
	}
	public static void devide(int a[],int i,int j) {
		if(i<j) {
			int m = (i+j) / 2;
			
			devide(a,i,m);
			devide(a,m+1,j);
			conquer(a,i,m,j);
			
		}
	}
	public static void main(String args[]) {
		int a[] = {6,8,1,3,83,2,94,10};
		
		int n = a.length;
		
		devide(a,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
}
