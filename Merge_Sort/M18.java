
public class M18 {
	void partition(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i = l;
		int j = m+1,k=0;
		
		while(i<=m && j<=h) {
			if(a[i]<a[j]) {
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
			a[i]  = s[j];
		}
	}
	void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			partition(a,l,m,h);
		}
	}
	void show(int a[]) {
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,2,4,5,7,8,9,6,3,21,12,25,42};
		
		M18 m = new M18();
		
		m.show(a);
	}
}
