package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
   twisters();
        String str = "AEFED";
        phonekeyPad(str);
    
    public static void twisters(){
        for(int i=1; i<=110; i++){
        if(i%6==0){
            System.out.print("Poodle");
        }else if(i%4==0){
            System.out.print("Beetle");
        }else if(i%2==0){
            System.out.print("Tweetle");
        }else{
            System.out.print(i+" ");
        }
        if(i%11==0){
            System.out.println();
        }
    }
    }
    

   
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
  public static void phonekeyPad(String str){
        for(int i=0; i<str.length(); i++){
            char upper = Character.toUpperCase(str.charAt(i));
            switch(upper){
                case 'A':
                case 'B':
                case 'C':
               System.out.print(2);
               break;
               case 'E':
                case 'F':
                case 'D':
               System.out.print(3);
               break;
                default:
                    System.out.println("this is not an alphabet");
                    break;
               
            }
        }
    }
}
    

    public static void main(String [] args) {
        

        /* Write your code here */
     
       call method twisters()
       prompt user to enter a string 
       call method phoneKeypad(string)


    }

}
