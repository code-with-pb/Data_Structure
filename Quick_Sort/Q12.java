import java.util.*;

public class Q12 {
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	int partition(int a[],int l,int h) {
		int v = a[h];
		int i=(l-1),j;
		for(j=l;j<h;j++) {
			if(a[j] <= v) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	void cal(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			
			cal(a,l,m-1);
			cal(a,m+1,h);
		}
	}
	void show(int a[]) {
		cal(a,0,a.length-1);
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
		System.out.print("Enter Data: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Q12 q = new Q12();
		
		q.get(a);
		q.show(a);
	}

}
