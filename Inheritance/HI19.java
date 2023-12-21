class Cal19{
	void Bb(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void Is(int a[]) {
		for(int i=0;i<a.length;i++) {
			int j = i-1;
			int t = a[i];
			while(j>=0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		}
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void conquer(int a[],int l,int m,int h) {
		int s[]=new int[h-l+1];
		int i=l,j=m+1,k=0;
		
		while(i<=m && j<=h) {
			if(a[i]<a[j]) {
				s[k] = a[i];
				i++;k++;
			}
			else {
				s[k] = a[j];
				j++;k++;
			}
		}
		while(i<=m) {
			s[k] = a[i];
			i++;k++;
		}
		while(j<=h) {
			s[k] = a[j];
			j++;k++;
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
		devide(a,0,a.length-1);
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
	void pivot(int a[],int l,int h) {
		if(l<h) {
			int m = partition(a,l,h);
			pivot(a,l,m-1);
			pivot(a,m+1,h);
		}
	}
	void show(int a[],int s,int e) {
		s = 0;
		e = a.length-1;
		pivot(a,s,e);
		System.out.print("Sorted Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	int Ls(int a[],int k) {
		int i=0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	int Bs(int a[],int k) {
		int s=0,e=a.length-1;
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
	void show(int a[],int k) {
		int i = Ls(a,k);
		if(i == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
		
		int j = Bs(a,k);
		if(j == -1) {
			System.out.println("Not Found...");
		}
		else {
			System.out.println("Found at index: "+ j);
		}
	}
}
public class HI19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal19 o = new Cal19();
		
		int a[]= {54,85,95,35,14,20,10,22};
		
		o.Bb(a);
		
		int a1[]= {54,85,95,35,14,20,10,22};
		
		o.Ss(a1);
		
		int a2[]= {54,85,95,35,14,20,10,22};
		
		o.Is(a2);
		
		int a3[]= {54,85,95,35,14,20,10,22};
		
		o.show(a3);
		
		int a4[] = {54,85,95,35,14,20,10,22};
		
		o.show(a4, 0, a.length-1);
		
		int a5[] = {10,20,30,40,50,60,70};
		
		int k = 60;
		
		o.show(a5, k);	
	}

}
