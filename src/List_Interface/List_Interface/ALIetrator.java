package List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ALIetrator {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		
		al.add(150);
		al.add(125);
		al.add(440);
		al.add(54);
		al.add(585);
		al.add(855);
		al.add(228);

		 System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		al.forEach(al1->{
			System.out.println(al1);
		});
		
		 List<String> tvShows = new ArrayList<>();
	        tvShows.add("Breaking Bad");
	        tvShows.add("Game Of Thrones");
	        tvShows.add("Friends");
	        tvShows.add("Prison break");

	        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
	        tvShows.forEach(tvShow -> {
	            System.out.println(tvShow);
	        });
	        
	        System.out.println("\n=== Iterate using an iterator() ===");
	        Iterator<Integer> num=al.iterator();
	        while(num.hasNext()) {
	        	Integer num1=num.next();
	        	System.err.println(num1);
	        }
	        
	        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
	        
	     Iterator<String> tvShowIterator = tvShows.iterator();
	        tvShowIterator.forEachRemaining(tvShow -> {
	            System.out.println(tvShow);
	        });
	        
	        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
//Note if we want to revers list first we have to iterate list then pointer goes at last value then use this list iterator then it will run ,  
//	       if we run this list iterator it will not run(not traverse  list)
	        ListIterator<String> tvShowListIterator=tvShows.listIterator(tvShows.size());
	        
	        while(tvShowListIterator.hasPrevious()) {
	        	String tvShowsLT=tvShowListIterator.previous();
	        	System.err.println(tvShowsLT);
	        }
	        
	        System.out.println("\n=== Iterate using simple for-each loop ===");
	        
	        for(String movieList :tvShows) {
	        	System.err.println(movieList);
	        }
	        System.out.println("\n=== Iterate using simple for-each loop ===");
//	        Note :-> Not Recomanded to use

	        for(int i=0 ; i<tvShows.size(); i++) {
	        	System.out.println(tvShows.get(i));
	        }
	        
	        
	        



		
	}
}
