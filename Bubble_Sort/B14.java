import java.util.*;

public class B14 {
	static void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] =  t;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {80,2,5,1,3};
		cal(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
