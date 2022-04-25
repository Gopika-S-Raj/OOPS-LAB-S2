package co;
import java.util.Scanner;

public class symmetric{

		
		public static void main(String[] args) {
			int m[][]=new int[5][5];



Scanner s=new Scanner(System.in);
System.out.println("enter the no of rows in the  matrix");
int r=s.nextInt();
System.out.println("enter the coloumns of the matrix");
int c=s.nextInt();
System.out.println("enter the  matrix");
for(int i=0;i<=r;i++) {
	for(int j=0;j<=c;j++) {
		m[i][j]=s.nextInt();
	}
	
}
int t[][]=new int[5][5];

for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
            t[j][i]=m[i][j];
}
}
int f=1;
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
            if (m[i][j]!=t[i][j]) {
            f=0;
            }
}
if(f==1) {
	System.out.println("given matrix is symmetric");
}
if(f==0) {
	System.out.println("given matrix is not symmetric");
}
	
}




}

}