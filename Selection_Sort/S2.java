
public class S2 {
	void A() {
		int a[] = {8,96,3,5,7,33,2,11,1};
		
		for(int i=0;i<a.length-1;i++) {
			int sm = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[sm] > a[j]) {
					sm = j;
				}
			}
			int t = a[sm];
			a[sm] = a[i];
			a[i] = t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
	public static void main(String [] args) {
		S2 o = new S2();
		o.A();
	}
}
