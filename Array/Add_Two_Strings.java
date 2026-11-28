public class Add_Two_Strings {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b={6,7,8,9,10};
         int[] arr = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            arr[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length; i++) {
            arr[index] = b[i];
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
