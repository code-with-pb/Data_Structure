
public class M9 {
	static void conquer(int a[],int l,int m,int h) {
		int s[] = new int[(h-l+1)];
		
		int i,j,k;
		i=l;
		j = m+1;
		k=0;
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
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
	static void devide(int a[],int i,int j) {
		if(i<j) {
			int k = (i+j)/2;
			devide(a,i,k);
			devide(a,k+1,j);
			conquer(a,i,k,j);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,2,9,5,3,1};
		
		devide(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
