
public class B4 {
	void A() {
		int a[] = {3,8,6,7,5,4,1};
		for(int i=0;i<a.length-1;i++) {
			for (int j = 0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 o = new B4();
		o. A();
	}

}
