public class Zig_Zag_Print {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int [] b={6,7,8,9,10};

        int[] c =new int[a.length+b.length];
        int index =0;

        for(int i=0;i<a.length;i++){
            c[index]=a[i];
            index++;

            c[index]=b[i];
            index++;
        }
        for(int i =0;i<c.length;i++){
            System.out.print( c[i] +" ");
        }
    }
}
