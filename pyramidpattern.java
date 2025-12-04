import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int midr=n;
        int midl=0;
        //for(int i=0;i<n;i++)
        //{
            //System.out.println(" ");   
            for(int j=0;j<n;j++)
            {
                if(j>=midl && j<=midr)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" ");
                }
                midl++;
                midr--; 
                System.out.println(" ");  
            }
           
        //}
    }
}
