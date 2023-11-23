
public class I21 {
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = (i-1);
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14,2,5,4,65,2,1};
		
		I21 i = new I21();
		
		i.cal(a);
	}

}
