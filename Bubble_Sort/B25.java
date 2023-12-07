
public class B25 {
	static void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {89,21,10,11,75,69,212,45,44,32,33,1};
		
		cal(a);
		show(a);
	}

}
