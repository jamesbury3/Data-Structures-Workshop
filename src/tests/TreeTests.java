package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructures.BSTNode;
import dataStructures.BSTSearcher;
import dataStructures.ListBuilder;

class TreeTests {

	/*
	 * Simple test to make sure the contains method
	 * works
	 */
	@Test
	void containsTest() {

		BSTNode n = new BSTNode("root");
		String[] values = {
			"a",
			"dog",
			"-4hdlkjfsdklfj",
			"sdlkjf",
			"sldfjois",
			"21kdlsjfklsdjl",
			"sdfio",
			"eaYQmsyEfNWLtXTieRNReVyUJ"
		};
		
		// Check contains right after insert
		for(String v : values) {
			assertTrue(n.insertNode(new BSTNode(v)));
			assertTrue(n.contains(v));
		}
		
		// Check contains again on every value
		for(String v : values) {
			assertTrue(n.contains(v));
		}
		
		// Check a string that is not in the list
		assertFalse(n.contains("not present"));
	}
	
	/*
	 * Tests contains on a list of 1000 strings
	 */
	@Test
	void bigListTest() {
		ListBuilder lb = new ListBuilder();
		String[] arr = lb.getList(1000);
		
		BSTSearcher searcher = new BSTSearcher(arr);
		searcher.findItem(true);
		
	}
}
