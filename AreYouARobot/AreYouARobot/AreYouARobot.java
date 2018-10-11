
/**
* Hacktoberfest 2018.
*
* @author (amekare)
*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;


public class AreYouARobot
{
    public static int waiting = 2;
    
    public static void main(String[] args)
    {
       ArrayList<String> questions = new ArrayList<>();
       questions.add("Ready to know if you are a robot?\n");
       questions.add("What is 2+2?\n");
       questions.add("Good to know that you know basic math, but lets get real...\n");
       questions.add("What is the answer of the universe, life and everything?\n");
       questions.add("I want to believe that you are not a robot. Last Question...\n");
       questions.add("What is the key? Only robots would know\n");
    
       delayPrint(questions.get(0), TimeUnit.MILLISECONDS);
    
    }
    
    
    public static void delayPrint(String question, TimeUnit time)
    {
        for (int i=0; i<question.length(); i ++)
        {
            try{
                System.out.print(question.charAt(i));
                time.sleep(waiting);
            }catch(Exception e){
                
            }
        }
        
    }

}
