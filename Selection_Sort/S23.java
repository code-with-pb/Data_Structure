import java.util.*;

public class S23 {
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	void cal(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		S23 s = new S23();
		
		s.get(a);
		s.cal(a);
	}

}
