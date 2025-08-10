import java.util.Scanner;
class DiagonalSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rc,i,j,sum=0;
        int MAT[][]=new int[50][50];
        System.out.println("Enter the no. of rows and columns of a square matrix : ");
        rc=sc.nextInt();
        System.out.println("Enter the elements of the Matrix : ");
        for(i=0;i<rc;i++)
        {
            for(j=0;j<rc;j++)
            {
                MAT[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is : ");
        for(i=0;i<rc;i++)
        {
            for(j=0;j<rc;j++)
            {
                System.out.print(MAT[i][j]+" ");
            }
            System.out.println();
        }
      
        for(i=0;i<rc;i++)
        {
            for(j=0;j<rc;j++)
            {
                if(i==j)
                {
                  sum+=MAT[i][j];  
                }
                else if(i+j==rc-1)
                {
                   sum+=MAT[i][j]; 
                }
            }

        }
        System.out.println("The Sum of both diagonal elements is : "+sum);
        
        
    }
}
