package week2_part1_e1_excer3_midelword;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        String inpoutString="";
        String strTemp = "";
        System.out.println(" please insert nextline: ");
        while(true)
        {
            
            inpoutString=sc.nextLine();
            for(int i=0;i<inpoutString.length();i++)
            {
                if(inpoutString.charAt(i)==',')
                {
                  if(strTemp.equals(""))
                  {
                      continue;
                  }
                  else
                  {
                      list.add(strTemp);
                      strTemp="";
                  }
                }
                 else
                {
                  strTemp+=inpoutString.charAt(i);
                }
            }
            if(strTemp.equals(""))
            {}
            else
            {
                
                      list.add(strTemp);
                      strTemp="";
            }
           System.out.println("Midle word is: "+list.get((list.size()-1)/2)+" ");
            System.out.println("\nplease insert nextline:");
        }
    }
}
