//      1.Write a program(WAP) to print INEURON using pattern programming logic.


/*package com.company;

public class assignment1Question1 {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 1 QUESTION 1 SOLUTION _____________");
        int n= 11;
        for (int i =0; i<n; i++)
        {
            for (int j=0 ; j<n; j++)
            {
                if ( j==(n-1)/2)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==0 || i==j && j<n-2 || j==n-2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==0 || i==0 && j!=n-1|| i==(n-1)/2 && j!=n-1 || i==n-1 && j!=n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==0 && i<n-1 || j==(3*n)/4 && i!= n-1 || i==n-1 && j<(3*n)/4 && j!=0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==0 || j==n-1 && i<(n-1)/2 && i>0  || i==0 && j<(n-1)
                        || i==(n-1)/2 && j<(n-1) || (i==j && i>(n-1)/2 &&j>=0) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==1 && i>0&& i<n-1 || j==n-2 && i >0 && i<n-1
                        || i==0 && j>1 && j<n-1 || i== n-1 && j>1 && j<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0 ; j<n; j++)
            {
                if (j==0 || i==j && j<n-2 || j==n-2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}



//2. Write a program to print
//1 1 1 1
//2 2 2 2
//3 3 3 3
//4 4 4 4

package com.company;

import java.util.Scanner;

public class assingment1Question2 {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 1 QUESTION 2 SOLUTION ______________");
        Scanner sc =new Scanner(System.in);
        int rows=4;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows; j++)
            {
                System.out.print("");
            }
            for (int j = 1; j <= rows; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}



// 3. WAP to print
***************
******* *******
*****    ******
***        ****
**           **
*             *
***************

package com.company;

public class assignment1Question3 {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 1 QUESTION 3 SOLUTION__________");
        int n = 15;
        for ( int i =0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if ( i==0 || j==0 || i==n-1 || j==n-1 ||i+j<=(n-1)/2 || j-i>=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}



//4. WAP to print


*                     *
**                   **
***                 ***
****               ****
*****             *****
******           ******
*******         *******
********       ********
*********     *********
**********   **********
*********** ***********
***********************

package com.company;

public class assignment1Question4 {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 1 QUESTION 4 SOLUTION__________");
        int n =14;
        for (int i =0; i<n; i++)
        {
            for (int j =0; j<n; j++)
            {
                if (i==n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}



// 5. WAP to print

**********
********
******
****
***
**
*
**
***
****
*****
******
*******
********
*********


package com.company;

public class assignment1Question5 {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT 1 QUESTION 5 SOLUTION___________");
        int n =15;
        for ( int i =0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (i==0 || i==n-1 || j==0 || i+j <=(n-1)/2|| i-j>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

 */
