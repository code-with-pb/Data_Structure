
public class L1 {
	static int LS(int a[],int k,int n) {
		int i=0;
		while(i<n && k!=a[i]) {
			i++;
		}
		if(i<n) {
			return (1);
		}
		return (-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {66,77,88,99,11};
		int k = 11;
		int n = 5;
		
		int i = LS(a,k,n);
		if(i==-1) {
			System.out.println("NOt Found: ");
		}
		else {
			System.out.print("Found at index : "+i+1);
		}
	}

}
