package _99_extra;


public class StringMethods2 {
	public static void main(String[] args) {
		String random = "TAfonElkl";
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		System.out.println(random.toUpperCase()); 
		System.out.println(random.toLowerCase());
		System.out.println(random.charAt(0) + "" + random.charAt(1) + "" + random.charAt(2));
		int i = random.length();
		if(i % 2 == 0) {
			i = i/2;
			System.out.println(random.charAt(i));
		}
		else {
		
			i = i/2;
			System.out.println(random.charAt(i));
		}
		int r = random.length();
System.out.println(random.charAt(r-3) + "" + random.charAt(r-2) + "" + random.charAt(r-3));
		
		
		
		//System.out.println("half of six is " + 6/2);
		//System.out.println("half of seven is " + 7/2 + " value 3.5 gets truncates to 3, meaning removal of decimals");
		// 2. Print your String to the console in upper case.
		
		// 3. Print your String to the console in lower case.

		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	}
}
