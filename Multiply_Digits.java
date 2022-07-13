//Write a program which accepts number from user and returns multiplication of all digits

import java.lang.*;
import java.util.*;

class Digits 
{
    public int MultiplyDigits(int iNo)
    {
        int iMult = 1;
        while(iNo != 0)
        {
            iMult = iMult * (iNo % 10);
            iNo = iNo/10;
        }
        return iMult;
    }
}

class Multiply_Digits
{
    public static void main(String args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.MultiplyDigits(iValue);

        System.out.println("Multiplication of all digits is : "+iRet);
    }
}