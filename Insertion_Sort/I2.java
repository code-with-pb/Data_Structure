
public class I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,9,6,3,2,1,4,5};
		int i,j;
		
		for(i=1;i<a.length;i++) {
			int t = i;
			for(j = i-1;j >=0 && t < a[j];j--) {
				a[j+1] = a[j];
			}
			a[j+1] = t;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
