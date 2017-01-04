public class EightiesKids4 {

  public static String markSpot(float n) {
	  // your code here
	  if(n % 2 == 1) {
		  
		  int leftSpaceCount = (int) (n - 1);		// magic number 1
		  int centerSpaceCount = 3;					// magic number 2
		  
		  // center X, only one
		  String result = String.format("%sX\n", new String(new char[leftSpaceCount]).replace("\0", " "));
		  
		  for(int i = 1; i <= (int)(n / 2); i++){		// start from 1, end after looping half of n
			  String line =  
					  String.format("%sX%sX\n", 		// 2 Xs with spaces
							  new String(new char[leftSpaceCount - 2]).replace("\0", " "),	// left spaces before first X
							  new String(new char[centerSpaceCount]).replace("\0", " ")		// center spaces between first and second X
					  );
			  result = String.format("%s%s%s", line, result, line);		// vertical symmetry
			  
			  leftSpaceCount -= 2;			// every line, decreases 2 spaces
			  centerSpaceCount += 4;		// every line, increases 4 spaces
		  }
		  
		  return result;
	  }
	  return "?";
  }
}