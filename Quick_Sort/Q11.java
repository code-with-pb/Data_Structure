
public class Q11 {
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = (l-1);
		int j = l;
		while(j<h) {
			if(a[j] <= v){
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			j++;
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	static void cal(int a[],int l,int h) {
		if(l<h) {
			int m=partition(a,l,h);
			cal(a,l,m-1);
			cal(a,m+1,h);
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
		int a[] = {10,2,4,5,6,32,12,421,11,21,8,9,7};
		
		cal(a,0,a.length-1);
		show(a);
	}

}
