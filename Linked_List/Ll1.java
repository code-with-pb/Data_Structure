
public class Ll1 {
	public static Node head;
	
	//calculating the size of LinkedList
	private static int size;
	
	Ll1(){
		this.size = 0;
	}
	static class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add- first
	public void addFirst(String data) {
		Node nd = new Node(data);
		if(head == null) {
			head = nd;
			return;
		}
		nd.next = head;
		head = nd;
	}
	public void AddLast(String data) {
		Node nd = new Node(data);
		if(head == null) {
			head = nd;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = nd;
	}
	public static void printList() {
		if(head == null) {
			System.out.println("list is Empty: ");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	//delete-First
	public static void deleteFirst() {
		if(head == null) {
			System.out.println("list is Empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	public static void deleteLast() {
		if(head == null) {
			System.out.println("list is Empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	public int getSize() {
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ll1 list = new Ll1();
		
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.AddLast("list");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
		
	}

}
