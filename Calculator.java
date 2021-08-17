import java.util.Scanner;
import java.util.*;
class test{
  public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    for(int count=0; count+1<100;count++){
      double num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
      int op;
      System.out.println("SELECT OPERATION:");
      System.out.println(" ");
      System.out.println("1 Addition");
      System.out.println("2 Subtraction");
      System.out.println("3 Multiplication");
      System.out.println("4 Division");
      System.out.println("5 Exit/End");
      System.out.println(" ");
      op= input.nextInt();
      System.out.println(" ");
      wait(1000);
      if(op >=6 && op <1)
      {
        System.out.print("Wrong Choice! Please try again");
      }
      if (op==1) {
        System.out.println("Addition");
        System.out.println("--------------------");
        System.out.println("This program allows addition of 10 numbers. ");
        System.out.println("Select how many numbers you want to add");
        System.out.println("--------------------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11 Exit/End");
        System.out.println(" ");
        System.out.println("--------------------");
        int aop;
        aop = input.nextInt();
        if(aop >=12 && aop <2)
        {
        System.out.print("Wrong Choice! Please try again");
        }
        if (aop == 2)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Answer: "+ (num1+num2));
        }
         if (aop == 3)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3));
        }
         if (aop == 4)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4));
        }
         if (aop == 5)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5));
        }
         if (aop == 6)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter forth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5+num6));
        }
         if (aop == 7)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5+num6+num7));
        }
         if (aop == 8)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5+num6+num7+num8));
        }
         if (aop == 9)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5+num6+num7+num8+num9));
        }
         if (aop == 10)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Enter tenth number:");
        num10= input.nextInt();
        System.out.println("Answer: "+ (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10));
        }
        if (aop == 11)
        {
          System.out.println("Exiting the Program");
          System.exit(0);
        }
      }
      if (op==2)
      {
        System.out.println("Subtraction");
        System.out.println("--------------------");
        System.out.println("This program allows Subtraction of 10 numbers. ");
        System.out.println("Select how many numbers you want to subtract");
        System.out.println("--------------------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11 Exit/End");
        System.out.println(" ");
        System.out.println("--------------------");
        int sop;
        sop = input.nextInt();
        if(sop >=12 && sop <2)
        {
        System.out.print("Wrong Choice! Please try again");
        }
        if (sop == 2)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Answer: "+ (num1-num2));
        }
         if (sop == 3)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3));
        }
         if (sop == 4)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4));
        }
         if (sop == 5)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5));
        }
         if (sop == 6)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter forth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5-num6));
        }
         if (sop == 7)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5-num6-num7));
        }
         if (sop == 8)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5-num6-num7-num8));
        }
         if (sop == 9)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5-num6-num7-num8-num9));
        }
         if (sop == 10)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Enter tenth number:");
        num10= input.nextInt();
        System.out.println("Answer: "+ (num1-num2-num3-num4-num5-num6-num7-num8-num9-num10));
        }
        if (sop == 11)
        {
          System.out.println("Exiting the Program");
          System.exit(0);
        }
      }
      if (op==3)
      {
        System.out.println("Multiplication");
        System.out.println("--------------------");
        System.out.println("This program allows multiplication of 10 numbers. ");
        System.out.println("Select how many numbers you want to multiply");
        System.out.println("--------------------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11 Exit/End");
        System.out.println(" ");
        System.out.println("--------------------");
        int mop;
        mop = input.nextInt();
        if (mop >=12 && mop <2)
        {
          System.out.print("Wrong Choice! Please try again");
        }
        if (mop == 2)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("answer: "+ (num1*num2));
      }
        if (mop == 3)
        {
          System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter first number:");
        num3= input.nextInt();
        System.out.println("answer: "+ (num1*num2*num3));
        }
        if (mop == 4)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4));
        }
         if (mop == 5)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5));
        }
         if (mop == 6)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter forth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5*num6));
        }
         if (mop == 7)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5*num6*num7));
        }
         if (mop == 8)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5*num6*num7*num8));
        }
         if (mop == 9)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5*num6*num7*num8*num9));
        }
         if (mop == 10)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Enter tenth number:");
        num10= input.nextInt();
        System.out.println("Answer: "+ (num1*num2*num3*num4*num5*num6*num7*num8*num9*num10));
        }
        if (mop == 11)
        {
          System.out.println("Exiting the Program");
          System.exit(0);
        }
      }
      if (op==4)
      {
        System.out.println("Division");
        System.out.println("--------------------");
        System.out.println("This program allows Division of 10 numbers. ");
        System.out.println("Select how many numbers you want to multiply");
        System.out.println("--------------------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11 Exit/End");
        System.out.println(" ");
        System.out.println("--------------------");
        int dop;
        dop = input.nextInt();
        if (dop >=12 && dop <2)
        {
          System.out.print("Wrong Choice! Please try again");
        }
        if (dop == 2)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("answer: "+ (num1/num2));
       }
        if (dop == 3)
        {
          System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter first number:");
        num3= input.nextInt();
        System.out.println("answer: "+ (num1/num2/num3));
        }
        if (dop == 4)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4));
        }
         if (dop == 5)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5));
        }
         if (dop == 6)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter forth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5/num6));
        }
         if (dop == 7)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5/num6/num7));
        }
         if (dop == 8)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5/num6/num7/num8));
        }
         if (dop == 9)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5/num6/num7/num8/num9));
        }
         if (dop == 10)
        {
        System.out.println("Enter first number:");
        num1= input.nextInt();
        System.out.println("Enter second number:");
        num2= input.nextInt();
        System.out.println("Enter third number:");
        num3= input.nextInt();
        System.out.println("Enter fourth number:");
        num4= input.nextInt();
        System.out.println("Enter fifth number:");
        num5= input.nextInt();
        System.out.println("Enter sixth number:");
        num6= input.nextInt();
        System.out.println("Enter seventh number:");
        num7= input.nextInt();
        System.out.println("Enter eighth number:");
        num8= input.nextInt();
        System.out.println("Enter ninth number:");
        num9= input.nextInt();
        System.out.println("Enter tenth number:");
        num10= input.nextInt();
        System.out.println("Answer: "+ (num1/num2/num3/num4/num5/num6/num7/num8/num9/num10));
        }
        if (dop == 11)
        {
          System.out.println("Exiting the Program");
          System.exit(0);
        }
      }
      if (op == 5)
        {
          System.out.println("Exiting the Program");
          System.exit(0);
        }
    }
  }
}
