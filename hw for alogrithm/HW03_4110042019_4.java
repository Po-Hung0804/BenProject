
public class HW03_4110042019_4 extends One_0k_rock{
	public static void main(String[] args) {
		String A[]= {"01","1100","1111","0011","00111"};
		HW03_4110042019_1 test=new HW03_4110042019_1();
		boolean x[]=test.one0k(A);
		
	}
	public boolean[] one0k(String[] str) {
		 boolean[] result = new boolean[str.length];
	        
	        for (int i = 0; i < str.length; i++) {
	            int zeros = 0;
	            int ones = 0;
	            
	            boolean isInvalid = false;
	            
	            for (int j = 0; j < str[i].length(); j++) {
	                char c = str[i].charAt(j);
	                
	                if (c == '0') {
	                    if (ones == 0) {
	                        zeros++;
	                    } else {
	                        isInvalid = true;
	                        break;
	                    }
	                } else if (c == '1') {
	                    ones++;
	                } else {
	                    isInvalid = true;
	                    break;
	                }
	            }
	            
	            result[i] = !isInvalid && zeros == ones;
	        }
	        
	        return result;
	}

}