import java.util.Arrays;
import java.util.Scanner;

public class ReplaceZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,3,5,0};
        System.out.println(Arrays.toString(arr));
        for (int i =0 ;i< arr.length; i++){
            if (arr[i]== 0){
                arr[i]= arr[i+1];

            } if (arr[arr.length-1 ] == 0){
                arr[arr.length-1]= arr[0];
            }

        }
        System.out.println(Arrays.toString(arr));
        //that the original uppgift
        replace(arr);
        for(int i =0;i < arr.length;i++ )
        System.out.println(arr[i]);
        int [] num = new int[4];
        System.out.println("skriva antal nummer");

        var scan = new Scanner(System.in);

            int nummer = scan.nextInt();
        num[0] = nummer;
        num[1] = scan.nextInt();
        num[2] = scan.nextInt();
        num[3] = scan.nextInt();
        replace(num);
        System.out.println(Arrays.toString(num));



    }

    public static void replace(int [] temp){
        for (int i =0; i < temp.length;i++){
            if (temp[i] == 0){
                temp[i]= temp[i+1];

            }
        }
    }
}
