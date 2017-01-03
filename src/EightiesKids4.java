public class EightiesKids4 {

  public static String markSpot(float n) {
	  // your code here
	  if(n % 2 == 1) {
		  StringBuilder sb = new StringBuilder();
		  int spaceCount1 = 0;
		  int spaceCount2 = (int) (n * 2 - 3);
		  // upper half
		  for(int i = 0; i < n / 2 - 1; i++){
			  if(spaceCount1 > 0){
				  sb.append(new String(new char[spaceCount1]).replace("\0", " "));
			  }
			  sb.append("X");
			  sb.append(new String(new char[spaceCount2]).replace("\0", " "));
			  sb.append("X\n");
			  
			  spaceCount1 += 2;
			  spaceCount2 -= 4;
		  }
		  
		  // the center
		  sb.append(new String(new char[(int) (n - 1)]).replace("\0", " "));
		  sb.append("X\n");
		  
		  spaceCount1 -= 2;
		  spaceCount2 += 4;
		  
		  // lower half
		  for(int i = (int) (n / 2) + 1; i < n; i++){
			  if(spaceCount1 > 0){
				  sb.append(new String(new char[spaceCount1]).replace("\0", " "));
			  }
			  sb.append("X");
			  if(spaceCount2 > 0){
				  sb.append(new String(new char[spaceCount2]).replace("\0", " "));
			  }
			  sb.append("X\n");
			  
			  spaceCount1 -= 2;
			  spaceCount2 += 4;
		  }
		  
		  return sb.toString();
	  }
	  return "?";
  }
}