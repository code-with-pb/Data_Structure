
public class L13 {
	static int B(int a[], int k) {
		int i=0;
		
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,8,9,6,3,2,1};
		
		System.out.print(B(a, 6));
	}

}
