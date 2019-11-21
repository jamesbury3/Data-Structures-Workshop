package dataStructures;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	
	static BSTSearcher bst_searcher;

    public static void main(String[] args) {

        ListBuilder lb = new ListBuilder();
        int list_size = 2000;
        System.out.println("Building List of " + list_size + " random strings...\n");
        String[] arr = lb.getList(list_size);
        bst_searcher = new BSTSearcher(arr);
        
        while (true) {
        	interpretChoice(arr);
        }
    }
    
    public static boolean interpretChoice(String[] arr) {
    	
    	boolean done = false;
        
        do {
        	System.out.println("\nHow would you like to search for the item?\n" + 
            		"Press 1 to Search through Array\n" + 
            		"Press 2 to Search with Binary Search Tree");
        	
        	try {
        		Scanner s = new Scanner(System.in);
        		int choice = s.nextInt();
        		
        		switch (choice) {
            	
	        		case 1:
	        			done = true;
	        			ArraySearcher searcher = new ArraySearcher(arr);
	        			searcher.findItem();
	        			break;
	        		case 2:
	        			done = true;
	        			
	        			bst_searcher.findItem(true);
	        			break;
	        		default:
	        			done = false;
	        			System.out.println("\nPlease enter an integer 1-2\n");
	        			break;
	        	}
        		    		
        	} catch (InputMismatchException e) {
        		System.out.println("\nPlease enter an integer 1-2\n");
        	}
        	
        } while (!done);
    	
    	return true;
    }
}
