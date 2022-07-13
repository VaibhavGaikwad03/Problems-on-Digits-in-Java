//Write a program which accepts number from user and returns the count of digits between 3 and 7 

import java.lang.*;
import java.util.*;

class Digits 
{
    public int CountInRange(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            if(((iNo % 10) > 3) && ((iNo % 10) < 7))
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}

class Count_In_Java
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountInRange(iValue);

        System.out.println("Count of digits between 3 and 7 is : "+iRet);
    }
}