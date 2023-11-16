
public class L7 {
	static int Ls(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static void show(int a[],int k) {
		int i = Ls(a,k);
		if(i == -1) {
			System.out.println("Not Found....");
		}
		System.out.println("found at index No: "+ i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {88,66,99,77,55,22,11,0,3};
		
		int k = 0;
		
		show(a,k);
	}

}
