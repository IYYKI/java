public class ArrayDemo {
    public static void main (String [] args){
        int [] number = {25,24,12,76,101,96,28};
        for (int i = 0; i<number.length -1;i++){
            for (int j = 0; j<number.length-1;j++){
                if (number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        for (int i = 0;i<number.length;i++){
            System.out.println(number[i]+" ");
        }
    }
}
