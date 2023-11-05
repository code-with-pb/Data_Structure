import java.util.*;

class Get3{
    public static int k;
    void get(int a[]){
        int i;
        System.out.print("Enter Element: ");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.print("Enter Key Value: ");
        k = sc.nextInt();
    }
}
class LS3 extends Get3{
    Get3 o3 = new Get3();
    int LS(int a[]){
        int k = o3.k;
        int i = 0;
        while(i<a.length){
            if(a[i] == k){
                return i;
            }
            i++;
        }
        return -1;
    }
    void show(int a[]){
        int k = o3.k;
        
        System.out.println(k);
        
        int i = LS(a);
        
        if(i == -1){
            System.out.println("Not Found: ");
        }
        else{
            System.out.println("Found at index no: "+ i);
        }
    }
}

class BS3 extends Get3{
    int BS(int a[]){
        int s = 0, e = a.length-1;
        int k = super.k;
        
        while(s<=e){
            int m = (s+e)/2;
            
            if(k == a[m]){
                return m;
            }
            else if(k > a[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
     void show(int a[]){
        int k = super.k;
        
        System.out.println(k);
        
        int i = BS(a);
        
        if(i == -1){
            System.out.println("Not Found: ");
        }
        else{
            System.out.println("Found at index no: "+ i);
        }
    }
}

public class HI6
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		int i = 0;
		
		Get3 o;
		o = new Get3();
		
		o.get(a);
		
		LS3 o1 = new LS3();
		o1.show(a);
		
		BS3 o4 = new BS3();
		o4.show(a);
	}
}
