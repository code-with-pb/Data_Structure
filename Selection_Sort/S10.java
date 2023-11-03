import java.util.*;

public class S10 {
	public static void cal(int a[]) {
		int i,j;
		for(i=0;i<a.length;i++) {
			int s = i;
			for(j=i+1;j<a.length;j++) {
				if(a[j] < a[s]) {
					s = j;
				}
			}
			int t=a[s];
			a[s] = a[i];
			a[i] = t;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter Array: ");
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		cal(a);
	}
}
