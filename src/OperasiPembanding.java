public class OperasiPembanding {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        boolean lebihDari = (x>y);
        boolean kurangDari = (x<y);
        boolean samaDengan = (x==y);
        boolean tidakSamaDengan = (x!=y);
        boolean lebihBesarSamaDengan = (x>=y);
        boolean lebihKecilSamaDengan = (x<=y);

        System.out.println(lebihDari);
        System.out.println(kurangDari);
        System.out.println(samaDengan);
        System.out.println(tidakSamaDengan);
        System.out.println(lebihBesarSamaDengan);
        System.out.println(lebihKecilSamaDengan);
    }
}
