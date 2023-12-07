
public class L11 {
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
		int a[] = {54,25,36,85,98,15,20};
		int k = 15;
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found..");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}

}
