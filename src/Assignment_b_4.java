import java.util.Scanner;
public class Assignment_b_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements ");
        int i,j;
        try {
            for(i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println("Enter the index of the element");
             j=sc.nextInt();
            System.out.println("The array element at index "+j+"="+arr[j]);
            System.out.println("The array element is accessed");
        }
        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (Exception obj) {
            System.out.println("java.util.InputMismatchException");
        }
        sc.close();
    }
}
