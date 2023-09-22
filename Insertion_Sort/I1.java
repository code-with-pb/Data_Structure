
public class I1 {
	public static void printA(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,8,3,1,2};
		
		for(int i=0;i<a.length-1;i++) {
			int t = a[i];
			
			//for(int j=i-1;i>= 0 && a[j]>t;j--){
			
			int j = i-1;
			while(j>=0 && t < a[j]) {
				a[j+1] = a [j];
				j--;
			}
			
			a[j+1] = t;
		}
		
		printA(a);
	}

}
