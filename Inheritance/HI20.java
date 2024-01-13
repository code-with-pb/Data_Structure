
public class HI20 {
	static void Bb(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
 				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void Ss(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int t = i;
			for(int j = i+1; j<a.length;j++) {
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
	static void Is(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void Conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i = l;
		int j = m+1;
		int k = 0;
		
		while(i<= m && j <= h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
			}
			else {
				s[k] =a[j];
				k++;j++;
			}
		}
		while(i <= m) {
			s[k] = a[i];
			k++;i++;
		}
		while(j <= h) {
			s[k] = a[j];
			k++;j++;
		}
		for(i = l,j = 0;i<=h;i++,j++) {
			a[i] = s[j];
		}
	}
	static void devide(int a[],int l , int h) {
		if(l<h) {
			int m = (l+h)/2;
			
			devide(a,l,m);
			devide(a,m+1,h);
			Conquer(a,l,m,h);
		}
	}
	static int partition(int a[],int l,int h) {
		int v = a[h];
		int i = (l-1);
		int j = l;
		
		while(j<h) {
			if(a[j] <= v) {
				i++;
				
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			j++;
		}
		int t = a[i+1];
		a[i+1] = a[h];
		a[h] = t;
		
		return i+1;
	}
	static void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	static void Show1(int a[]) {
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static void Show2(int a[]) {
		pivot(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int Ls(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	static int Bs(int a[],int k) {
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
	static void show(int a[], int k) {
		int i = Ls(a,k);
		if(i == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.print("Found at index"+ i);
		}
		
		System.out.println();
		
		devide(a,0,a.length-1);
		int j = Bs(a,k);
		if(j == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.print("Found at index"+ j);
		}
	}
	public static void main(String args[]) {
		int a1[] = {7,2,8,5,6,9,4,3,1,0};
		
		Bb(a1);
		
		int a2[] = {7,2,8,5,6,9,4,3,1,0};
		
		Ss(a2);
		
		int a3[] = {7,2,8,5,6,9,4,3,1,0};
		
		Is(a3);
		
		int a4[] = {7,2,8,5,6,9,4,3,1,0};
		
		Show1(a4);
		
		int a5[] = {7,2,8,5,6,9,4,3,1,0};
		
		Show2(a5);
		
		int a6[] = {7,2,8,5,6,9,4,3,1,0};
		
		int k = 4;
		
		show(a6, k);
	}
}
