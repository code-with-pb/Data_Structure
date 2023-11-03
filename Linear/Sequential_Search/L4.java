
public class L4 {
	static int cal(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8,9,7};
		
		int k = 7;
		
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found: "+ i);
		}
	}
}
