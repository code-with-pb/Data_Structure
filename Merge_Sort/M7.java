
public class M7 {
	public static void val(int a[],int l,int m,int h) {
		int s [] = new int[(h-l+1)];
		
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
	public static void cal(int a[],int i,int j) {
		if(i<j) {
			int k = (i+j)/2;
			cal(a,i,k);
			cal(a,k+1,j);
			val(a,i,k,j);
		}
	}
	public static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int n;
		int a[] = {10,50,6,3,4,20,12,32,95,45,68,23,54,77,88,66,11,22,33,44};
		
		cal(a,0,a.length-1);
		show(a);
	}
}
