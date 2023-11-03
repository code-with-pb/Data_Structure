
public class L2 {
	static int LS(int a[],int k,int n) {
		int i=0;
		while(i<n) {
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int k = 8;
		int n = 9;
		
		int i = LS(a,k,n);
		
		if(i == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.print("Found: "+ i);
		}
	}

}
