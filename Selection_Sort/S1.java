
public class S1 {
	public static void printA(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,8,3,1,2};
		
		//Selection Sort
		for(int i=0;i<a.length-1;i++) {
			int sm = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[sm] > a[j]) {
					sm = j;
				}
			}
			int temp = a[sm];
			a[sm] = a[i];
			a[i] = temp;
		}
		
		printA(a);
	}

}
