
public class B24 {
	static void show(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++){
			for(j=i+1;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");		
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {12,54,10,251,122,30,100,456,62,32,35,75};
		
		show(a);
	}

}
