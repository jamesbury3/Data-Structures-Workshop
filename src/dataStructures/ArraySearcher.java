package dataStructures;

public class ArraySearcher {
	
	private String[] ls;
	private String target;
	
	public ArraySearcher(String[] ls) {
		this.ls = ls;
		target = ls[ls.length - 1];
	}

	public void findItem() {
		long start = System.nanoTime();
		boolean found = false;
		
		for (int i = 0; i < ls.length; i++) {
			if (ls[i].equals(target)) {
				found = true;
				System.out.println(getTimeDiff(start, found));
			}
		}
		
		if (!found) 
			System.out.println(getTimeDiff(start, found));
		
	}
	
	public String getTimeDiff(long start, boolean found) {
		long finish = System.nanoTime();
        long timeElapsed = finish - start;
        
        if(found)
        	return "Searching via array took " + timeElapsed + " nanoseconds, found item.\n";
        
        return "Searching via array took " + timeElapsed + " nanoseconds, did not find item.\n";
	}
}
