public class Javaortalamabulma{
    
    public static void main(String[] args) {
        
        double[] dizi = { 16.3, 7.5, 78.6, -20.4, 43.05, 45 };
        double toplam = 0.0;
 
        for (double sayi: dizi) {
           toplam += sayi;
        }
 
        double ortalama = toplam / dizi.length;
        System.out.format("Dizinin Ortalaması: %.2f", ortalama);
        System.out.println();
    }   
}
 
