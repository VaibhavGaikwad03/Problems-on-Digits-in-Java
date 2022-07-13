//Write a java program which accepts number from the user and return difference between summation of even digits and summation of odd digits

import java.lang.*;
import java.util.*;

class Digits 
{
    public int CountDiff(int iNo)
    {
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
           if(((iNo % 10) % 2) == 0)
           {
                iSumEven = iSumEven + (iNo % 10);
           }
           if(((iNo % 10) % 2) != 0)
           {
                iSumOdd = iSumOdd + (iNo % 10);
           }
           iNo = iNo / 10;
        }
        return iSumEven - iSumOdd;
    }
}

class Diffr_Even_Odd
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountDiff(iValue);

        System.out.println("Difference between summation of even and odd numbers is : "+iRet);
    }
}