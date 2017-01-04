public class EightiesKids4 {

  public static String markSpot(float n) {
	  // your code here
	  if(n % 2 == 1) {
		  
		  int leftSpaceCount = (int) (n - 1);
		  int centerSpaceCount = 3;
		  
		  String result = String.format("%sX\n", new String(new char[leftSpaceCount]).replace("\0", " "));
		  
		  for(int i = 1; i <= (int)(n / 2); i++){
			  String line =  
					  String.format("%sX%sX\n", 
							  new String(new char[leftSpaceCount - 2]).replace("\0", " "),
							  new String(new char[centerSpaceCount]).replace("\0", " ")
					  );
			  result = String.format("%s%s%s", line, result, line);
			  
			  leftSpaceCount -= 2;
			  centerSpaceCount += 4;
		  }
		  
		  return result;
	  }
	  return "?";
  }
}