import java.util.*;

public class I20 {
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	void cal(int a[]) {
		int i;int j;
		for(i=0;i<a.length;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	void show(int a[]) {
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		I20 i = new I20();
		
		i.get(a);
		i.cal(a);
		i.show(a);
	}

}
