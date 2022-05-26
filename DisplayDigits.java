import java.lang.*;
import java.util.*;

class Digits
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
        {
            int iDigit = 0;

            if(iNo < 0)
            {
                iNo = -iNo;
            }

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                System.out.println(iDigit);
                iNo = iNo / 10;
            }
        }
}

class DisplayDigits
{
    public static void main(String arg[])
    {
        Digits dobj = new Digits();

        dobj.Accept();
        dobj.Display();
    }
}