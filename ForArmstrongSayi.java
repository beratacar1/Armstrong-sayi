/**
 * ForArmstrongSayi
 */
public class ForArmstrongSayi {

    public static void main(String[] args) {
        // 153 = ( 1* 1 * 1) + ( 55 * 5 * 5) + ( 3 * 3 * 3) 
        //Armstrong sayıları  bulan program

        int temp, birler, onlar, yüzler, toplam;
        for(int i = 100; i<=999; i++) {
           temp = i;

           birler = temp % 10;
           temp /= 10;
           
           onlar = temp % 10;
           temp /= 10;

           yüzler = temp % 10;
           temp /= 10;

           toplam = (birler * birler * birler) + (yüzler * yüzler * yüzler) + (onlar * onlar * onlar);

           if(toplam == i) {
            System.out.println(i + "bir Armstrong sayıdır");
           }
        }
    } 
}