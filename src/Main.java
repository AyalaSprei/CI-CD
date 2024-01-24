import java.util.Scanner;

public class Main {
    public static int findSingle(int [] arr){
        int sum =0;
        int length = arr.length;
        for(int i=0; i<length; i++){
            sum+=arr[i];
        }
        int maxSingle=sum-length/2 + sum%2;

        for(int i = maxSingle;i>0;i--){
            for(int j=0; j<arr.length; j+=2){
                if(arr[j]==i){
                    return arr[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello worldd!");

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Result: " + findSingle(arr));
    }}
