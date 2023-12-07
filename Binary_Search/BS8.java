
public class BS8 {
	static int cal(int a[],int k) {
		int s = 0, e = a.length;
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50,60,70,80,90};
		
		int k = 30;
		
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}

}
