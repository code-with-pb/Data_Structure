import java.util.*;

class Get4{
	void get(int a[]) {
		System.out.print("Enter Element: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
	}
}
class Bb4 extends Get4{
	static void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		System.out.print("After Sort: ");
		for(int s=0;s<a.length;s++) {
			System.out.print(a[s]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[]) {
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int i=0,k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		k = sc.nextInt();
		
		while(i<a.length) {
			if(k == a[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[]) {
		int i,k,s,e;
		System.out.print("Array: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		k = sc.nextInt();
		
		s=0;
		e = a.length-1;
		while(s<=e) {
			int m = (s+e)/2;
			
			if(a[m] == k) {
				return m;
			}
			else if(a[i] < m) {
				s=m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}
	void show(int a[]) {
		int n;
		int s;
		cal(a);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		do {
			System.out.print("Enter 1 or 2: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					s = Ls(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				case 2:
					s = Bs(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<2);
	}
	
}
class Ss4 extends Get4{
	static void cal(int a[]) {
		int i,j;
		System.out.print("Before Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<a.length;i++) {
			int t = i;
			for(j=i+1;j<a.length-1;j++) {
				if(a[j] < a[t]) {
					t = j;
				}
			}
			int s = a[t];
			a[t] = a[i];
			a[i] = s;
		}
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[]) {
		int i=0;
		System.out.print("Array: ");
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[]) {
		int s = 0, e = a.length-1;
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
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
	void show(int a[]) {
		int n;
		int s;
		cal(a);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		do {
			System.out.print("Enter 1 or 2: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					s = Ls(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				case 2:
					s = Bs(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<2);
	}
}
class Is4 extends Get4{
	static void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int i,j;
		for(i=0;i<a.length;i++) {
			int t = a[i];
			j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		System.out.print("After Sort: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[]) {
		int i=0;
		System.out.print("Array: ");
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[]) {
		int s = 0, e = a.length-1;
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
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
	void show(int a[]) {
		int n;
		int s;
		cal(a);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		do {
			System.out.print("Enter 1 or 2: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					s = Ls(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				case 2:
					s = Bs(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<2);
	}
}
class Ms4 extends Get4{
	static void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i=l;
		int j=m+1;
		int k=0;
		while(i<=m && j<=h) {
			if(a[i]< a[j]) {
				s[k] = a[i];
				k++;
				i++;
			}
			else {
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
			k++;j++;
		}
		for(i=l,j=0;i<=h;i++,j++) {
			a[i] = s[j];
		}
	}
	static void cal(int a[],int l, int h) {
		if(l<h) {
			int m = (l+h)/2;
			cal(a,l,m);
			cal(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	static void Sh(int a[]) {
		cal(a,0,a.length-1);
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[]) {
		int i=0;
		System.out.print("Array: ");
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[]) {
		int s = 0, e = a.length-1;
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
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
	void show(int a[]) {
		int n;
		int s;
		Sh(a);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		do {
			System.out.print("Enter 1 or 2: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					s = Ls(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				case 2:
					s = Bs(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<2);
	}
}
class Qs4 extends Get4{
	static int partition(int a[],int l, int h) {
		int v = a[h];
		int i=(l-1);
		for(int j=l;j<h;j++) {
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
		
		return i;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	static void Sh(int a[]) {
		pivot(a,0,a.length-1);
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[]) {
		int i=0;
		System.out.print("Array: ");
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[]) {
		int s = 0, e = a.length-1;
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Key: ");
		int k = sc.nextInt();
		
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
	void show(int a[]) {
		int n;
		int s;
		Sh(a);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		int i=0;
		do {
			System.out.print("Enter 1 or 2: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					s = Ls(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				case 2:
					s = Bs(a);
					if(s == -1) {
						System.out.println("Not Found....");
					}
					else {
						System.out.println("Found at index: "+ s);
					}
					break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
			i++;
		}while(i<2);
	}
}
public class HI7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		Get4 o = new Get4();
		o.get(a);
		
		int i;
		int k = 0;
		
		do {
			System.out.print("Enter No 1,2,3,4,5: ");
			i = sc.nextInt();
			switch(i) {
				case 1: 
					Bb4 b = new Bb4();
					b.show(a);
					break;
				case 2:
					Ss4 s = new Ss4();
					s.show(a);
					break;
				case 3:
					Is4 o1 = new Is4();
					o1.show(a);
					break;
				case 4:
					Ms4 m = new Ms4();
					m.show(a);
					break;
				case 5:
					Qs4 q = new Qs4();
					q.show(a);
					break;
				default:
					System.out.println("Invalid Input.....");
					break;
			}
			k++;
		}while(k<5);
	}

}
