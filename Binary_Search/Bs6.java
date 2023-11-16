
public class Bs6 {
	static int cal(int a[],int k) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
	static void show(int a[],int k) {
		int i=cal(a,k);
		if(i == -1) {
			System.out.println(a[i]+" ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60,70,80};
		int k = 20;
		
		cal(a,k);
		show(a,k);
	}

}
