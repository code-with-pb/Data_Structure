
public class Bs4 {
	static int cal(int a[],int k) {
		int s=0,e=a.length-1;
		
		while(s<=e) {
			int m=(s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else {
				e=m-1;
			}
		}
		return -1;
	}
	static void show(int a[],int k) {
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found...");
		}else {
		System.out.println("Found at index: "+ i);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,20,30,40,50};
		
		int k=30;
		
		show(a,k);
	}

}
