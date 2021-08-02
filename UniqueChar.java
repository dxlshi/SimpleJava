import java.util.Scanner ;
public class UniqueChar {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Enter your String : ");
        String word = input.nextLine() ;
        input.close () ;
        
        int duplicatesFoundForCurrentString = 0;
        int TotalUniqueStrings = 0 ;
    
        for (int x = 0 ; x<word.length(); x++){
            System.out.println("The Letter selected is : " +word.charAt(x)); //selecting the key

            for( int y = 0 ; y <=x ; y++){ // searching already considered simillar letters 
                // System.out.println("Comparing "+word.charAt(x)+ " with "+word.charAt(y));
                // System.out.println("value of DUPLICATES FOUND from previoous loop: "+duplicatesFoundForCurrentString); //working
                if(word.charAt(y)==word.charAt(x)){
                    duplicatesFoundForCurrentString ++ ;                    
                }
                // System.out.println("Duplicates found for "+word.charAt(x)+" is "+duplicatesFoundForCurrentString);  //working
                
                }  
                System.out.println("Duplicates already found for "+word.charAt(x)+" is "+duplicatesFoundForCurrentString);  //working
                if (duplicatesFoundForCurrentString == 1){
                TotalUniqueStrings ++;
            } 
            duplicatesFoundForCurrentString= 0;   
                 
        }
        System.out.println("The number of unique characters present in the String :  "+TotalUniqueStrings);
        System.out.println("------------------------------------------------ ");   
                       
    }
}
