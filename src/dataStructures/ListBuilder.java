package dataStructures;

import java.util.HashSet;
import java.util.Random;

public class ListBuilder {

    private String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "0123456789"
        + "abcdefghijklmnopqrstuvxyz"; 
    private Random r;
    
    public ListBuilder() {
        r = new Random();
        r.setSeed(1234);
    }

    /*
     * Returns an array of n unique Strings, each consisting
     * of 25 random characters
     */
    public String[] getList(int n) {
    	
    	HashSet<String> random_strings = new HashSet<String>();
    	
        for(int i = 0; i < n; i++) {
        	if (i % (n/10) == 0) {
        		int bars = (int)(10 * ((double)i / (double)n));
        		showProgress(bars);
        	}
            random_strings.add(generateString(25));
        }
        
        String[] ls = new String[random_strings.size()];
        random_strings.toArray(ls);
        return ls;
    }
    
    public String generateString(int n) {

        String s = "";
        
        for(int i = 0; i < n; i++) {
            s += ALPHANUMERIC.charAt(r.nextInt(ALPHANUMERIC.length()));
        }
        return s;
    }
    
    public void showProgress(int bars) {
    	String progress = "|";
    	for(int i = 0; i < bars; i++) {
    		progress += "=";
    	}
    	for(int i = bars; i < 10; i++) {
    		progress += " ";
    	}
    	System.out.print(progress + "|\r");
    }
}
