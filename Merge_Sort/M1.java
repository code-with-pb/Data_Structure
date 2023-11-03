
public class M1 {
	public static void conquer(int a[], int s,int mid,int e) {
		int merged[] = new int[e-s+1];
		
		int n1 = s;
		int n2 = mid+1;
		int x = 0;
		
		while(n1 <= mid && n2 <=e) {
			if(a[n1] <= a[n2]) {
				merged[x] = a[n1];
				x++;
				n1++;
			}
			else {
				merged[x] = a[n2];
				x++;
				n2++;
			}
		}
		while(n1 <= mid) {
			merged[x] = a[n1];
			x++;
			n1++;
		}
		while(n2 <= e) {
			merged[x] = a[n2];
			x++;
			n2++;
		}
		for(int i=0, j=s; i<merged.length;i++,j++) {
			a[j] = merged[i];
		}
	}
	public static void devide(int a[],int s, int e) { //s is staritin index && e is ending index
		if(s<e) {
			return;
		}
		int mid =  s+(e-s)/2;//(s+e)/2;
		devide(a,s,mid);
		devide(a,mid+1,e);
		conquer(a,s,mid,e);
	}
	public static void main(String args[]) {
		int a[] = {6,3,9,5,2,8};
		int n = a.length;
		devide(a,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
}
