package Array;

import java.util.PriorityQueue;
public class QueueEx 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Ram");
		queue.add("Om");
		queue.add("Hari");
		queue.add("Aryan");
		queue.add("John");
		queue.add("Adii");
		
		System.out.println("Head of element is:" +queue.element());
		
	}

}
