
public class B20 {
	void cal(int a[]) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] >  a[j+1]) {
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
		B20 b = new B20();
		int a[] = {10,5,2,36,4,101,523,2};
			b.cal(a);
	}

}
