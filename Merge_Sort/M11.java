
public class M11 {
	static void conquer(int a[],int l,int m,int h) {
		int s[] = new int [h-l+1];
		int i=l;int j=m+1;int k=0;
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				i++;k++;
			}
			else {
				s[k] = a[j];
				j++;k++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			i++;
			k++;
		}
		while(j<=h) {
			s[k] = a[j];
			k++;j++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = s[j];
		}
	}
	static void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			conquer(a,l,m,h);
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
		int a[] = {88,22,9,3,4,55,66,77,99,11,22,0,5,6,10};
		
		devide(a,0,a.length-1);
		show(a);
	}

}
