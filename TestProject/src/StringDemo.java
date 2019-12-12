
public class StringDemo {

	public static void main(String[] args) {
		/*
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		String s4 = "welcome to Java";
		String s5 = "Java";
		
		System.out.println(s1==s2);		// output : false
		System.out.println(s1==s3);		// output : true
		System.out.println(s1==s4);		// output : false
		System.out.println(s3==s5);		// output : true
		
		System.out.println(s1.equals(s2));  // output : true
		System.out.println(s1.equals(s3));	 // output : true
		*/
		
		/*
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = new String("Java");
		String s4 = new String("World");
		System.out.println(s1.compareTo(s2));  // output : 0
		System.out.println(s1.compareTo(s3));	 // output :13 
		System.out.println(s1.compareTo(s4));	 // output :some negative number
		*/
		String s1 = "Dog";
		String s2 = "Cat";
		
		System.out.println(s1.compareTo(s2));   // output : 1
		System.out.println(s2.compareTo(s1));   // output : -1
		
		if (s1.compareTo(s2)>0)
			System.out.println("This is Dog");
		else
			System.out.println("This is Cat");
		
		// Demo use length
		/*
		String message = "This is Dog";
		System.out.println(message.length());
		
		// How to use charAt
		int count=0;
		for(int i=0; i < message.length(); i++){
			if( message.charAt(i) !=' ')
				count++;
		}
		System.out.println("Count is " + count);
		
		System.out.println(s1 + "\t" + s2);
		System.out.println(s1.concat(s2));
		*/
		
		// Use substring
		String message = "This_is_a_dog";
		//System.out.println(message.substring(5));  // is a dog
		//System.out.println(message.substring(0,5)); // output : This
		
		System.out.println("Welcome".replace("el", "AB")); 
		
		// Use split
				
				String[] tokens = "Java#HTML#Perl".split("#", 0);
				for (int i = 0; i < tokens.length; i++) 
				  System.out.print(tokens[i] + " ");
				
				System.out.println();
				
				String[] terms = message.split("_", 0);
				for (int i = 0; i < terms.length; i++) 
				  System.out.println(terms[i]);
			 
				
				// Use indexOf
				String messagei = "This is Dog";
				System.out.println(messagei.indexOf('i'));		//output ?
				System.out.println(messagei.indexOf('c'));       // output ?


	}

}
