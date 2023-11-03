
public class L3 {
	public static int cal(int a[],int k) {
		for(int i=0;i<a.length;i++) {
			if(k == a[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,12,21,30,32,23};
		
		int k = 30;
		
		int i = cal(a,k);
		
		if(i == -1) {
			System.out.print("Not Found: ");
		}
		else{
			System.out.print("Found: "+ i);
		}
	}

}
