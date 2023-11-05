import java.util.*;

class Get2{
    void get(int a[]){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }
}
class MS2 extends Get2{
    static void conquer(int a[],int l,int m,int h){
        int s [] = new int[(h-l+1)];
        
        int i = l;
        int j = m+1;
        int k = 0;
        
        while(i<=m && j<=h){
            if(a[i] < a[j]){
                s[k] = a[i];
                k++;i++;
            }
            else{
                s[k] = a[j];
                k++;j++;
            }
        }
        while(i<=m){
            s[k] = a[i];
            k++;i++;
        }
        while(j<=h){
            s[k] = a[j];
            k++;j++;
        }
        for(i=l,j=0;i<=h;i++,j++){
            a[i] = s[j];
        }
    }
    static void devide(int a[],int l,int h){
        if(l<h){
            int m = (l+h)/2;
            devide(a,l,m);
            devide(a,m+1,h);
            conquer(a,l,m,h);
        }
    }
    void show(int a[]){
        System.out.println("After Quick Sorting: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class QS2 extends Get2{
    static int partition(int a[],int l,int h){
        int v = a[h];
        int i = (l-1);
        int j;
        for(j=l;j<h;j++){
            if(a[j] <= v){
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
    static void pivot(int a[],int l,int h){
        if(l<h){
            int m = partition(a,l,h);
            pivot(a,l,m-1);
            pivot(a,m+1,h);
        }
    }
    void show(int a[]){
        System.out.println("After Quick Sorting: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class HI5
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		int i = 0;
		
		Get2 o;
		o = new Get2();
		
		o.get(a);
		
		MS2 o1 = new MS2();
		QS2 o2 = new QS2();
		
		do{
		    System.out.print("Choose 1 or 2: ");
		    int k = sc.nextInt();
		    switch(k){
		        case 1:
		              o1.devide(a,0,a.length-1);
		              o1.show(a);
		              break;
		        case 2:
		              o2.pivot(a,0,a.length-1);
		              o2.show(a);
		              break;
		        default:
		                System.out.println("Invalid Input.....");
		    }
		    i++;
		}while(i<2);
	}
}