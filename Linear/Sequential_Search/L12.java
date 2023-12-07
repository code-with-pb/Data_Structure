
public class L12 {
	static int cal(int a[],int k) {
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
		int a[]= {10,20,30,40,50,6,0,4,7,5};
		
		int k = 0;
		
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}

}
