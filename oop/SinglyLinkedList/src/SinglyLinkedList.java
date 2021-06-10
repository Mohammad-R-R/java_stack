public class SinglyLinkedList {
    public Node head =null;
    public SinglyLinkedList() {
        head =null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
            	
                runner = runner.next;
            }
            runner.value=value;
            
            runner.next = newNode;
            

            
        }
    } 
    
    public void remove() {
    	Node current;
    	current=this.head;
    	while(current.next.next!=null) {
    		current=current.next;
    		
    		
    		
    	}
    	current.next=null;
    	
    }
    
    public void printValues() {
    	Node c ;
    	c =this.head;
    	while(c !=null) {
    		System.out.println(c.value);
    		c=c.next;
    		
    	}
    }
}