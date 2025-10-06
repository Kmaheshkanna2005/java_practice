
import java.util.*;


public class vowelcon {
    static boolean isvowel(char a)
    {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  a;
        System.out.print("Enter the string = ");
        a=sc.next();
        char[] b=a.toCharArray();
        int v=0;
        int c=0;
        for(int i=0;i<b.length;i++)
        {
            if(isvowel(b[i]))
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.print("the vowel = "+v+" the cons = "+c);
        }
    }

