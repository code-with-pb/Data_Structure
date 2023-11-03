import java.util.Scanner;

class GG{
	void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
}
class Conquer extends GG{
	void conquer(int a[],int l,int m,int h) {
		int ar [] = new int[(h-l+1)];
		
		int i,j,k;
		
		i=l;
		j = m+1;
		k=0;
		while(i<=m && j <= h) {
			if(a[i] < a[j]) {
				ar[k] = a[i];
				k++;i++;
			}
			else {
				ar[k] = a[j];
				k++;j++;
			}
		}
		while(i<=m) {
			ar[k] = a[i];
			k++;i++;
		}
		while(j<=h) {
			ar[k] = a[j];
			k++;
			j++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = ar[j];
		}
	}
}
class Devide extends Conquer{
	void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			super.conquer(a,l,m,h);
		}
	}
}
class Di extends Devide{
	void show(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
public class M10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Di o = new Di();
		o.get(a);
		o.devide(a, 0, n-1);
		o.show(a);
	}

}
