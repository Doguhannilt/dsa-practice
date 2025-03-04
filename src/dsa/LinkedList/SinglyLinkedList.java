
package dsa.LinearSearch;


public class SinglyLinkedList {
	Node head;
	
	public void insert(int data){
		Node newNode = new Node(data);
		Node temp = head;
		if(head =! null){head = newNode;}
		else{
			while(temp.next != null){
				temp = temp.next;
			}
			
			temp.next = newNode;;
		}
	}
	
	public void display(){
		Node temp = head;
		if(temp != null) {
			System.out.println(temp.data)
			temp temp.next;
		}
	}
	
	public boolean search(int target){
		Node temp = head;
		while (temp != null) {
			if(temp.data == target){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public boolean reverse(){
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		} 
		head = prev;
	}
	
	public void delete(int data) {
    if (head == null) return; 
 
    if (head.data == data) {
        head = head.next; 
        return;
    }

    Node temp = head;
    while (temp.next != null && temp.next.data != data) {
        temp = temp.next; // Verilen değeri bulana kadar ilerle
    }

    if (temp.next != null) {
        temp.next = temp.next.next; 
    }
}

	
}


class Node {
	int data;
	int next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}