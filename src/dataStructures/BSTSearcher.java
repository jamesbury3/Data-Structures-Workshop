package dataStructures;

public class BSTSearcher {
	
	private String[] ls;
	private String target;
	private BSTNode n;
	
	public BSTSearcher(String[] ls) {
		this.ls = ls;
		target = ls[ls.length - 1];
		
		System.out.println("Building Binary Search Tree...");
		
		n = new BSTNode(ls[0]);
		for(int i = 1; i < ls.length; i++) {
						
			n.insertNode(new BSTNode(ls[i]));
		}
		findItem(false);
	}
	
	public void findItem(boolean shouldPrint) {
		long start = System.nanoTime();
		
		if(n.contains(target) && shouldPrint) {
			System.out.println(getTimeDiff(start, true));
		} else if (!n.contains(target) && shouldPrint){
			System.out.println(getTimeDiff(start, false));
		}
	}
	
	public String getTimeDiff(long start, boolean found) {
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		if (found)
			return "\nSearching via a Binary Search Tree took " + timeElapsed + " nanoseconds, found item.\n";
		return "\nSearching via a Binary Search Tree took " + timeElapsed + " nanoseconds, did not find item.\n";
		
	}
}
