package assignment;

public class CodeRepository {

	public boolean input(String s) {
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		if(rev.equals(s)) {
			return true;
		}
		else {
			System.out.println("Not a palindrome");
			return false;
		}
	}
	
public boolean input(int a) {
	int temp = a;
	int sum = 0, b;
	while(a>0) {
		
		b = a%10;
		sum = (sum*10)+ b; 
		a = a/10;
		
	}
	if(sum == temp) {
		return true;
	}
	return false;
  }

public int swap_Required(String s){
	
	int n = s.length()-1;
	 
    char array_Char[] = s.toCharArray();
    
    int count = 0;
    
    for (int i = 0; i < n / 2; i++) {

        int first = i;
        int last = n - first;

        while (first < last) {
            if (array_Char[first] == array_Char[last]) {
                break;
            }
             else {
                    last--;
                }
        }
        
         if (array_Char[first] != array_Char[n - first]) {
// Swapping characters
        	   
            char temp = array_Char[last];
            array_Char[last] = array_Char[n - first-1];
            array_Char[n - first] = temp;
            count++;
        }
    }

    return count;
    
}

}


