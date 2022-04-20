import java.util.Locale;
import java.util.Scanner;

public class edabit {


    /*
    WordRank Puanlama Sistemi
Bir dizi sözcük alan ve en yüksek puan alan sözcüğü döndüren bir işlev oluşturun. Bir kelimenin her harfi alfabedeki konumuna göre puan alır: a = 1, b = 2, c = 3, vb.

Örnekler
wordRank("The quick brown fox.") ➞ "brown"

wordRank("Nancy is very pretty.") ➞ "pretty"

wordRank("Check back tomorrow, man!") ➞ "tomorrow"

wordRank("Wednesday is hump day.") ➞ "Wednesday"
notlar
İki kelime aynı puanı alıyorsa, orijinal dizede ilk görünen kelimeyi döndürün.
Döndürülen dize yalnızca alfabetik karakterler (az) içermelidir.
Döndürülen dizedeki büyük/küçük harf durumunu koru (yukarıdaki 4. örneğe bakın).

     */
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
int puan =0;
String maxString="";
        System.out.println("Cümle giriniz");
        String cumle = scan.nextLine().toLowerCase();

        String arr[] = cumle.split(" ");
        for ( String w : arr){
            String k=(w.replaceAll("[^a-zA-Z]", ""));
            int onPuan =0;
            for (int i = 0; i < k.length(); i++) {
                onPuan += k.charAt(i)-'a'+1;
                if(onPuan> puan){
                    puan = onPuan;
                    maxString=k;
                }

            }



        }System.out.println(maxString+" ="+puan);

    }
}
