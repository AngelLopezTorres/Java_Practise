
import java.util.Scanner;

public class Problmea11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;
    int q = 0;
    
    while(true){
    String cent = sc.next();
    if(cent.equals(".")){
        break;
    }

    int cent2 = Integer.parseInt(cent);
    
    for(i = 0; i <= cent2/7;i++){
        int sobrante = cent2 - 7 * i;
            if(sobrante % 4 ==0){
                q = 0;
                q = q + sobrante / 4;
                System.out.print(i + " ");
                System.out.print(q + " ");
            }  
    }
}
    sc.close();
   }
}

