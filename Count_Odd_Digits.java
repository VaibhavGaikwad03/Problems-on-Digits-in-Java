import java.lang.*;
import java.util.*;

class Digits 
{
    public int CountOddDigit(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            if((iNo % 10)%2 != 0)
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}

class Count_Odd_Digits
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountOddDigit(iValue);

        System.out.println("Count of odd digits is : "+iRet);
    }
}