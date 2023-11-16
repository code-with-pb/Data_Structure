
public class L9 {
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
	static void show(int a[],int k) {
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,354,42,57,6};
		int k = 57;
		cal(a,k);
		show(a,k);
	}

}
