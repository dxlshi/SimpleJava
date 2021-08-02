import java.util.Scanner ;
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter String here : ");
        String word = new Scanner(System.in).nextLine() ;

        boolean result = false ;
        int sumOfMatches = 0 ;
        for (int i = (word.length()-1) ;i>=0 ; i--){
            int count = 0  ;
            if (word.charAt(i)==word.charAt(count)){
                sumOfMatches ++ ;
                
            }
            count ++ ;
        }
        if (sumOfMatches==word.length()){
            result = true ;
        }
        System.out.println(result);
        
    }
}
