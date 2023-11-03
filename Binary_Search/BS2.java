
public class BS2 {
	static int Bs(int a[],int k) {
		int s = 0, e = a.length-1;
	
		while(s<=e) {
			int m = (s+e)/2;
			
			if(k == a[m]) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else{
				e = m-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60};
		int k = 60;
	
		int i = Bs(a,k);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println(k+" is present at index  no: "+ i);
		}
		
	}

}
