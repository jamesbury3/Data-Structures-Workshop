package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructures.BSTNode;
import dataStructures.BSTSearcher;
import dataStructures.ListBuilder;

class TreeTests {

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
		
		for(String v : values) {
			assertTrue(n.insertNode(new BSTNode(v)));
			assertTrue(n.contains(v));
		}
		assertFalse(n.contains("not present"));
	}
	
	@Test
	void bigListTest() {
		ListBuilder lb = new ListBuilder();
        String[] arr = lb.getList(1000);
        
        BSTSearcher searcher = new BSTSearcher(arr);
        searcher.findItem(true);
        
	}

}
