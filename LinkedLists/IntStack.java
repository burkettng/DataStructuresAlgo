public class IntStack {
	//Create private data here.
	private Node head;


	public IntStack() {
		//Code to initialize my stack.
		head = null;

	}

	public void push(int x) {
		// TODO: Code to push an item x onto the stack. 
		//The stack wlil never contain more than 100 elements.

		Node coolNode = new Node(x, head); //Create a new node with the value being x and the head = head.
		//System.out.printf("you just pushed %d onto the stack.\n", x);
        head = coolNode; //Setting the head to the new Node.
	}

	public int pop() {
		// TODO: Code to pop and retrun an item from the top of the stack.
		//If the stack is empty, return -1.

		//If the stack is empty return -1;
		if (head == null){
			return -1;
		}

		int retVar = head.value; //Save the value that you popped. 
		head = head.next; //Move the head to the next node. 

		//System.out.printf("The value you poped is: %d\n", retVar);

		return retVar; //Return the value of the item popped. 
	}

	public void print(){

        //System.out.println("first print method.");
        print(head);
    }

//////////////////////////////////////////////////////
////////// NEED TO DELET BEFORE SUBMISSION ///////////
//////////////// FOR TESTING ONLY ////////////////////

    public void print(Node var){

		//System.out.println("second print method.");
        if(var == null){
            return;
        }
            
        print(var.next);
        System.out.printf("%d\n", var.value);
    }
}
