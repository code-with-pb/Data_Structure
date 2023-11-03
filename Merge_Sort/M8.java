
public class M8 {
	static void partition(int a[],int l,int m,int h) {
		int ar[] = new int[(h-l+1)];
		
		int i = l;
		int j = m+1;
		int k = 0;
		
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				ar[k] = a[i];
				k++;i++;
			}
			else {
				ar[k] = a[j];k++;j++;
			}
		}
		while(i<=m) {
			ar[k] = a[i];k++;i++;
		}
		while(j<=h) {
			ar[k] = a[j];j++;k++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = ar[j];
		}
	}
	static void devide(int a[],int i,int j) {
		if(i<j) {
			int k = (i+j)/2;
			
			devide(a,i,k);
			devide(a,k+1,j);
			partition(a,i,k,j);
		}
	}
	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,21,30,42,15,23,25,65,11};
		
		devide(a,0,a.length-1);
		show(a);
	}
}
