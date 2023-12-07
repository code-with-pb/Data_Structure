
import java.util.Scanner;

class Get16{
	static int k;
	Scanner sc = new Scanner(System.in);
	void get(int a[]) {
		System.out.print("Enter Data: ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	void set() {
		System.out.print("Enter Key: ");
		k = sc.nextInt();
	}
}
class Cc extends Get16 {
	void Bb(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;i++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	void Ss(int a[]) {
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
	}
	void Is(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] < t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
	}
	void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			
			devide(a,l,m);
			devide(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	void conquer(int a[],int l,int m,int h) {
		int s []=new int[h-l+1];
		int i=l,j=m+1,k=0;
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
			}
			else{
				s[k] = a[j];
				k++;j++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			k++;i++;
		}
		while(j<=h) {
			s[k] = a[j];
			j++;k++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = s[j];
		}
	}
	int partition(int a[],int l,int h) {
		int v = a[h];
		int i=(l-1);
		int j = l;
		while(j<h) {
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
	void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	int Ls(int a[]) {
		int k = super.k;
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	int Bs(int a[]) {
		int k = super.k;
		int s = 0, e = a.length-1;
		while(s<=e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[m] < k) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
}
class Show extends cal{
	void show(int a[]) {
		int i,sum;
		Get16 g = new Get16();
		cal o = new cal();
		Scanner sc = new Scanner(System.in);
		int k = 0;
		do {
			System.out.print("Enter Choice: 1,2,3,4,5,6,7: ");
			int n = sc.nextInt();
			
			switch(n) {
				case 1:
					g.get(a);
					o.Bb(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 2:
					g.get(a);
					o.Ss(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 3:
					g.get(a);
					o.Is(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 4:
					g.get(a);
					o.devide(a, 0, a.length-1);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 5:
					g.get(a);
					o.pivot(a, 0, a.length-1);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 6:
					g.get(a);
					g.set();
					sum = o.Ls(a);
					if(sum == -1) {
						System.out.println("Not Found...");
					}
					else {
						System.out.println("Found at index: "+ sum);
					}
					break;
				case 7:
					g.get(a);
					g.set();
					sum = o.Ls(a);
					if(sum == -1) {
						System.out.println("Not Found...");
					}
					else {
						System.out.println("Found at index: "+ sum);
					}
					break;
				default: 
					System.out.println("Invalid Input....");break;
					
			}
			k++;
		}while(k<7);
	}
}
public class HI16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int n = sc.nextInt();
		
		int a[] = new int [n];
		
		int i,sum;
		Get16 g = new Get16();
		Cc o = new Cc();

		int k = 0;
		do {
			System.out.print("Enter Choice: 1,2,3,4,5,6,7: ");
			int j = sc.nextInt();
			
			switch(j) {
				case 1:
					g.get(a);
					o.Bb(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 2:
					g.get(a);
					o.Ss(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 3:
					g.get(a);
					o.Is(a);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 4:
					g.get(a);
					o.devide(a, 0, a.length-1);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 5:
					g.get(a);
					o.pivot(a, 0, a.length-1);
					for(i=0;i<a.length;i++) {
						System.out.print(a[i]+" ");
					}
					System.out.println();
					break;
				case 6:
					g.get(a);
					g.set();
					sum = o.Ls(a);
					if(sum == -1) {
						System.out.println("Not Found...");
					}
					else {
						System.out.println("Found at index: "+ sum);
					}
					break;
				case 7:
					g.get(a);
					g.set();
					sum = o.Ls(a);
					if(sum == -1) {
						System.out.println("Not Found...");
					}
					else {
						System.out.println("Found at index: "+ sum);
					}
					break;
				default: 
					System.out.println("Invalid Input....");break;
					
			}
			k++;
		}while(k<7);
		
		/*Show s = new Show();
		
		s.show(a);*/;
	}

}
