package homework6;

import java.util.Arrays;

public class Task {

    /**
     * Дано число, записанное своими разрядами в массиве, например, число 546 будет представлено массивом [5, 4, 6]. Прибавить к этому "числу" 1.
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(function(arr)));
    }

    public static int[] function(int[]arrInput){
        int intInput=0;
        int factor=1;

        for (int i = arrInput.length-1; i >=0; i--) {
            intInput+=arrInput[i]*factor;
            factor*=10;
        }

        intInput+=1;

        String str = String.valueOf(intInput);
        int[] resArr = new int[str.length()];

        for (int i = resArr.length-1; i >=0 ; i--) {
            resArr[i]=intInput%10;
            intInput/=10;
        }

        return resArr;
    }
}
