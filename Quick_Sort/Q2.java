import java.util.*;

public class Q2 {
	public static void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	public static int partition(int a[],int l,int h) {
		int v,i,j;
		v = a[h];
		i = (l-1);
		
		for(j=l;j<h;j++) {
			if(a[j]<= v) {
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
	public static void devide(int a[],int l,int h) {
		if(l<h) {
			int j = partition(a,l,h);
			
			devide(a,l,j-1);
			devide(a,j+1,h);
		}
	}
	public static void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		get(a);
		devide(a,0,a.length-1);
		show(a);
	}

}
