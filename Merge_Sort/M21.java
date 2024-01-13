
public class M21 {
	static void conquer(int a[],int l,int m, int h) {
		int s[] = new int[h-l+1];
		int i = l;
		int j = m+1;
		int k = 0;
		
		while(i<=m && j<= h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				i++;
				k++;
			}
			else {
				s[k] = a[j];
				k++;j++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			k++;i++;
		}
		while(j<=h) {
			s[k] = a[j];
			k++;j++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = s[j];
		}
	}
	static void devide(int a[], int l, int h) {
		if(l<h) {
			int m = (l+h)/2;
			
			devide(a,l,m);
			devide(a, m+1,h);
			conquer(a,l,m,h);
		}
	}
	static void show(int a[]) {
		devide(a, 0, a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,7,6,5,4,3,2,9,1};
		
		show(a);
	}

}
