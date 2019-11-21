package dataStructures;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	
	static BSTSearcher bst_searcher;

    public static void main(String[] args) {

    	// Build a list of unique random strings with 25 characters each
        ListBuilder lb = new ListBuilder();
        int list_size = 2000;
        System.out.println("Building List of " + list_size + " random strings...\n");
        String[] arr = lb.getList(list_size);
        
        // Build binary tree with list of random strings
        bst_searcher = new BSTSearcher(arr);
        
        // Continue asking the user what to do
        while (true) {
        	interpretChoice(arr);
        }
    }
    
    public static void interpretChoice(String[] arr) {
    	
    	boolean done = false;
        
    	while (!done) {
        	System.out.println("\nHow would you like to search for the item?\n" + 
            					 "Press 1 to Search through Array.\n" + 
            					 "Press 2 to Search with Binary Search Tree.\n" +
            					 "Press 3 to exit.");
        	
        	try {
        		Scanner s = new Scanner(System.in);
        		int choice = s.nextInt();
        		
        		switch (choice) {
            	
        			// Search with an array
	        		case 1:
	        			done = true;
	        			ArraySearcher searcher = new ArraySearcher(arr);
	        			searcher.findItem();
	        			break;
	        		
	        		// Search with a binary tree
	        		case 2:
	        			done = true;
	        			bst_searcher.findItem(true);
	        			break;
	        			
	        		// Exit program
	        		case 3:
	        			System.exit(0);
	        			
	        		default:
	        			done = false;
	        			System.out.println("\nPlease enter an integer 1-2\n");
	        			break;
	        	}
        		    		
        	} catch (InputMismatchException e) {
        		System.out.println("\nPlease enter an integer 1-2\n");
        	}
        }
    }
}
