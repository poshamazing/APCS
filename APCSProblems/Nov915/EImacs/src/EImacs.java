public class EImacs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"has", "one", "humongously", "long", "string" };
		String[] y = { "quite", "a", "short", "array" };
		String[] z = { };
		int[] a = { 0 };
		int[] b = { 2, 1, 3, 1, 2, 3, 4 };
		System.out.println( atLongLast(y));
	}
	public static String atLongLast( String[] a ) 
	  { 
	    String s = ""; 
	    int maxIdx = 0; 
	    for ( int i = 1 ; i < a.length ; i++ ) 
	    { 
	      if ( a[ maxIdx ].length() < a[ i ].length() ) 
	      { 
	        s = a[ i ].substring( a[ i ].length() - 1 ); 
	        maxIdx = i; 
	      } 
	    } 
	    return s; 
	  }
	
}