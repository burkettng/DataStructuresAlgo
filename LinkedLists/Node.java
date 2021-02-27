/**
 * Class Node. Represents a single node in the linked list.
 * Each node only contains an integer value and a next reference.
 **/
public class Node {
	public int value;
	public Node next;

	public Node(int var01, Node nodeVar) {
		value = var01;
		next = nodeVar;
	}
}
