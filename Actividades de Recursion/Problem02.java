public class Problem02 {
    /*
     * Suma de elementos de un array
     */
    public static int sumaArray(int[] arr, int n){
        if (n == 0) {
            return 0; // Caso base
        } else{
            return sumaArray(arr, n-1) + arr[n-1];
        }
    }

    public static void main(String[] args) {
        System.out.println(sumaArray(new int[]{1,2,3,4,5}, 5));
    }
}
