package oopslab;

import java.util.Scanner;

public class symmetricmatrix{
int a[][],b[][];
int r,c;

public static void main(String[] args) {



Scanner s=new Scanner(System.in);
System.out.println("enter the no of rows in the  matrix");
int r=s.nextInt();
System.out.println("enter the coloumns of the matrix");
int c=s.nextInt();
System.out.println("enter the  matrix");
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
a[i][j]=s.nextInt();
}
}
System.out.println("enter the transpose of matrix");
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
b[i][j]=s.nextInt();
}
}
if(a[i][j]==b[i][j])
{
System.out.println("the matrix is symmetric");

}
if(a[][]!=b[][])
{
System.out.println("the matrix not symmetric");

}





}

}

