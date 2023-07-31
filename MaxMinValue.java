public class MaxMinValue {
    public static void main(String arg[]) {
        int[] valueArray = new int[10];

        valueArray[0] = 1;
        valueArray[1] = 2;
        valueArray[2] = 3;
        valueArray[3] = 4;
        valueArray[4] = 5;
        valueArray[5] = 6;
        valueArray[6] = 7;
        valueArray[7] = 8;
        valueArray[8] = 9;
        valueArray[9] = 10;
        

        int i = valueArray.length;
        for(i = 0; i <= valueArray.length; i++) {
            System.out.print(valueArray[i] + " ");
        }
    }
}
