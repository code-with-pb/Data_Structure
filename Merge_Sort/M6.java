import java.util.Scanner;

public class M6 {
	
	static int n=12;
	
	public void get(int a[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Element: ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public void conquer(int a[], int l,int m, int u) {
		int s[] = new int[12];
		
		int i,j,k;
		i=l;
		j=m+1;
		k=0;
		
		while(i<=m && j<=u) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;
				i++;
			}
			else {
				s[k] = a[j];
				k++;
				j++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			k++;
			i++;
		}
		while(j<=u) {
			s[k] = a[j];
			k++;
			j++;
		}
		for(i=l,j=0;i<=u;i++,j++) {
			a[i] = s[j];
		}
	}
	
	public void devide(int a[],int i,int j) {
		if(i<j) {
			int k = (i+j)/2;
			
			devide(a,i,k);
			devide(a,k+1,j);
			conquer(a,i,k,j);
		}
	}
	
	public void show(int a[]) {
		for(int i =0; i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M6 o = new M6();
		
		int a[] =  new int[12];
		
		o.get(a);
		o.devide(a, 0, a.length-1);
		o.show(a);
	}

}
