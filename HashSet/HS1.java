import java.util.HashSet;
import java.util.Iterator;

public class HS1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create HashSet
		HashSet<Integer> s = new HashSet<>();
		
		//Insert HashSet
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(7);
		s.add(8);
		s.add(1);
		
		//Search HashSet
		
		if(s.contains(1)) {
			System.out.println("Set contains 1");
		}
		if(!s.contains(6)) {
			System.out.println("set does't contain 6");
		}
		
		// delete HashSet Element
		
		s.remove(1);
		
		if(!s.contains(1)) {
			System.out.println("1 is Deleted");
		}
		
		// HashSet Size 
		System.out.println(s.size());
		
		
		//print All Element
		
		System.out.println(s);
		
		// Iterator :- is used for traversing 
		Iterator it = s.iterator();
		
		//set doesn't have sequence
		
		//hasNext; next; these are two fuction
		
		
		//it.nexe it point first element i.e = 1
		// it.next = 2
		
		//it.hasNext() is show true or not
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
