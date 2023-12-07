import java.util.*;

class Bb17{
	void cal(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
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
}
class Ss17{
	void cal(int a[]) {
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
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Is17{
	void cal(int a[]) {
		for(int i=0;i<a.length;i++) {
			int t = a[i];
			int j = i-1;
			while(j>= 0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] =  t;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Ms17{
	void conquer(int a[],int l,int m,int h) {
		int s[] = new int[h-l+1];
		int i = l;
		int j= m+1;
		int k =0;
		
		
		while(i<=m && j<=h) {
			if(a[i] < a[j]) {
				s[k] = a[i];
				k++;i++;
			}
			else {
				s[k] =  a[j];
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
		devide(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class Qs17{
	int partition(int a[],int l,int h) {
		int s = a[h];
		int i = (l-1);
		for(int j=l;j<h;j++) {
			if(a[j] <= s) {
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
		pivot(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class LBS{
	int cal(int a[],int k) {
		int i = 0;
		while(i<a.length) {
			if(a[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	int bs17(int a[],int k) {
		int s = 0,e = a.length-1;
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
		int i = cal(a,k);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
	void show17(int a[],int k) {
		int i = bs17(a,k);
		if(i == -1) {
			System.out.println("Not Found: ");
		}
		else {
			System.out.println("Found at index: "+ i);
		}
	}
}
public class HI17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,54,687,12,45,85,65,21,20,32,11};
		
		//Bb17 b = new Bb17();
		//b.cal(a);
		
		//Ss17 s = new Ss17();
		//s.cal(a);
		
		//Is17 i = new Is17();
		//i.cal(a);
		
		//Ms17 m = new Ms17();
		//m.show(a);
		
		//Qs17 q = new Qs17();
		//q.show(a);
		
		//LBS l = new LBS();
		//l.show(a, 687);
		//l.show17(a, 21);
		
	}

}
