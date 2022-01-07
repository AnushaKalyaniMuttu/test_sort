/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		double[] array=new double[]{12.0,2.0,3.32879,0.3423,4.3420,6.349,11.342,99.324};
		for(int i=0;i<array.length;i++){
		    for(int j=i;j<array.length;j++){
		        if(array[i]>array[j]){
		          double temp=array[i];
		            array[i]=array[j];
		            array[j]=temp;
		        }
				
				//Testing webhooks
				//1
				
		    }
		    System.out.println(array[i]);
		}
	}
}

