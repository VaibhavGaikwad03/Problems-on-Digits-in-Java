//Write a java program which accepts number from the user and return the count of even digits   

import java.lang.*;
import java.util.*;

class Digits 
{
    public int CountEvenDigit(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            if((iNo % 10)%2 == 0)
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}

class Count_Even_Digits
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountEvenDigit(iValue);

        System.out.println("Count of even digits is : "+iRet);
    }
}