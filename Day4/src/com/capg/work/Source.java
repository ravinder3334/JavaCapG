package com.capg.work;

class Activity {
	// Implement Activity class here..
	String string1;
	String string2;
	String operator;

	Activity() {
	}

	Activity(String s1, String s2, String op) {
		this.string1 = s1;
		this.string2 = s2;
		this.operator = op;
	}

}

public class Source {

	// Implement the two function given in description in here...

//	static boolean flag = true;

	public static String handleException(Activity a) throws Exception {

//	    try{
//	      if(a.string1 == null || a.string2 == null){
//	    	 
//	        throw new NullPointerException();
//	      }
//	      if((!(a.operator.equals("+")) && !(a.operator.equals("-")))){
//	        throw new Exception();
//	      }
//	    }
//	    catch(NullPointerException e){
//	    	flag=false;
//	      return "Null values found";
//	    }
//	    catch(Exception e){
//	    	flag=false;
//	      return a.operator;
//	    }
//	    return "No Exception Found";
		try {
		if (a.string1 == null || a.string2 == null)
			throw new NullPointerException("Null values found");
		if ((!(a.operator.equals("+")) && !(a.operator.equals("-"))))
			throw new Exception(a.operator);
		}//  NullPointerException
		catch(NullPointerException e) {
			return e.getMessage();
		}
		catch(Exception e) {
			return e.getMessage();
		}
		return "No Exception Found";
	}

	
	
	
	public static String doOperation(Activity a) {
		
			String s = "";
			switch (a.operator) {
			case "+":
				s = a.string1 + a.string2;
				break;
			case "-":
				s = a.string1.replace(a.string2, "");
				break;
			default:
			}
			return s;
		
	}

	public static void main(String args[]) throws Exception {
		// Write your own main to check the program...

		Activity act = new Activity();
		act.string1 = "helloworld";
		act.string2 = "world";
		act.operator = "*";

		String h = handleException(act);
		String d = doOperation(act);

		System.out.println(h);
		System.out.println(d);

	}
}