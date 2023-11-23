import java.util.*;

class Get14{
	public int k;
	void get(int a[]) {
		System.out.print("Enter Data: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter Key: ");
		k = sc.nextInt();
	}
}
class Bb14 extends Get14{
	void cal(int a[]) {
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
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ss14 extends Get14{
	void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is14 extends Get14{
	void cal(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] < t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms14 extends Get14{
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i = l,j=m+1,k=0;
		
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
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
	void devide(int a[],int l,int h) {
		if(l<h) {
			int m = (l+h)/2;
			devide(a,l,m);
			devide(a,m+1,h);
			conquer(a,l,m,h);
		}
	}
	void show(int a[]) {
			System.out.print("Before Sort: ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			devide(a,0,a.length);
			System.out.print("After Sort: ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
	}
}
class Qs14 extends Get14{
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
	void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	void show(int a[]) {
		System.out.print("Before Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		pivot(a,0,a.length);
		System.out.print("After Sort: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ls14 extends Get14{
	public int k = super.k;
	
	int cal(int a[]) {
		System.out.println(k);
		
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	void show(int a[]) {
		int i = cal(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index NO: "+ i);
		}
	}
}
class Bs14 extends Get14{
	public int k = super.k;
	int cal(int a[]) {
		int s=0,e = a.length-1;
		k = super.k;
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
		k=super.k;
		int i = cal(a);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index NO: "+ i);
		}
	}
}
public class HI14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		Get14 g = new Get14();
		Bb14 b = new Bb14();
		Ss14 s = new Ss14();
		Is14 o = new Is14();
		Ms14 o2 = new Ms14();
		Qs14 q = new Qs14();
		Ls14 l = new Ls14();
		Bs14 b1 = new Bs14();
		int k;
		int j=0;
		
		int i=0;
		do {
			System.out.print("Choose: 1,2,3,4,5: ");
			int o1 = sc.nextInt();
			switch(o1) {
				case 1: g.get(a);
						b.cal(a);
						do {
							System.out.print("Choose: 1,2: ");
							k = sc.nextInt();
							switch(k) {
							case 1: l.show(a);
									break;
							case 2: b1.show(a);
									break;
							default: System.out.println("Invalid Input...");break;
						}
							j++;
						}while(j<2);
						
						break;
				case 2: g.get(a);
						s.cal(a);
						do {
							System.out.print("Choose: 1,2: ");
							k = sc.nextInt();
							switch(k) {
							case 1: l.show(a);
									break;
							case 2: b1.show(a);
									break;
							default: System.out.println("Invalid Input...");break;
						}
							j++;
						}while(j<2);
						
						break;
				case 3: g.get(a);
						o.cal(a);
						
						do {
							System.out.print("Choose: 1,2: ");
							k = sc.nextInt();
							switch(k) {
							case 1: l.show(a);
									break;
							case 2: b1.show(a);
									break;
							default: System.out.println("Invalid Input...");break;
						}
							j++;
						}while(j<2);
						
						break;
				case 4: g.get(a);
						o2.show(a);
						do {
							System.out.print("Choose: 1,2: ");
							k = sc.nextInt();
							switch(k) {
							case 1: l.show(a);
									break;
							case 2: b1.show(a);
									break;
							default: System.out.println("Invalid Input...");break;
						}
							j++;
						}while(j<2);
						
						break;
				case 5: g.get(a);
						q.show(a);
						do {
							System.out.print("Choose: 1,2: ");
							k = sc.nextInt();
							switch(k) {
							case 1: l.show(a);
									break;
							case 2: b1.show(a);
									break;
							default: System.out.println("Invalid Input...");break;
						}
							j++;
						}while(j<2);
						
						break;
				default: System.out.println("Invalid Input...");break;
			}
			i++;
		}while(i<5);
	}

}
