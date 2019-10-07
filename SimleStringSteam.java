import java.util.ArrayList;

public class SimleStringSteam {
	
   public static void main(String[] args) {
	   ArrayList<String> names = new ArrayList<>();

	   names.add("Irina");
	   names.add("Ivan");
	   names.add("Andrei");
	   names.add("Tatiana");
	   names.add("Ileana");
	   
	   
	   //STREAM
	   
	   names
	   .stream()                                    //create stream
	  // .limit(4) 
	   //.skip(2)
	   .filter(name -> name.contains("I"))
	   .map(name -> name.toUpperCase())
	   
	   /* f(String name ){return name.tiUpperCase() }
	    * 
	    */
	   
	   .forEach(System.out::println);        //end steram
	   
	   //STREAM
	   
	   
	   
	   
}
}
