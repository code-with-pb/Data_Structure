
public class BS1 {
	static int bs(int a[],int k) {
		int s = 0, e = a.length-1;
		
		while(s <= e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			if(a[m] < k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		int k = 10;
		
		System.out.println("K is at index: "+ bs(a,k));
	}

}
