import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello There");
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements in array");
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,0,2);
        System.out.println("you entered :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//hola
        }

    }
}