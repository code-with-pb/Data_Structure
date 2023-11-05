
public class L6 {
	static int LS(int a[], int k) {
		int i = 0;
		while(i<a.length) {
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String args[]) {
		int a[] = {10,20,3,0,55,4,9,30};
		
		int k = 0;
		
		int i = LS(a,k);
		
		if(i==-1) {
			System.out.println("NOt Found: ");
		}
		else {
			System.out.println(k+" is found at index: "+ i);
		}
		
	}
}
