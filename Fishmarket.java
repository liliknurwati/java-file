import java.util.*;

public class Fishmarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga=0;
        String ulang="";
        String nama = "";

        do{
            System.out.println("FISH MARKET YUHU");
            System.out.println("================");
            System.out.println("Jenis Ikan");
            System.out.println("1. Bandeng");
            System.out.println("2. Tengggiri");
            System.out.println("3. Nila");
            System.out.println("4. Patin");
            System.out.println("5. Gurame");
            System.out.println("6. Salmon");
            System.out.println("7. Tuna");
            System.out.println("8. Lele");
            System.out.println("9. Tongkol");
            System.out.println("--------------");
            System.out.print("Beli Ikan? ");
            int ikan = sc.nextInt();
            System.out.print("Berapa Kilo? ");
            int berat = sc.nextInt();
            System.out.println("--------------");
            switch(ikan){
                case 1:
                    nama = "Ikan Bandeng";
                    harga = 24000;
                    
                    break;
                case 2:
                    nama = "Ikan tenggiri";
                    harga = 75000;
                    
                    break;
                case 3:
                    nama = "Ikan Nila";
                    harga = 26000;
                    break;
                case 4:
                    nama = "Ikan Patin";
                    harga = 19000;
                    break;
                case 5:
                    nama = "Ikan Gurame";
                    harga = 45000;
                    break;
                case 6:
                    nama = "Ikan Salmon";
                    harga = 230000;
                    break;
                case 7:
                    nama = "Ikan Tuna";
                    harga = 68000;
                    break;
                case 8:
                    nama = "Ikan Lele";
                    harga = 20000;
                    break;
                case 9:
                    nama = "Ikan Tongkol";
                    harga = 35000;
                    break;
            }
            System.out.println("=================================");
            System.out.println("\tStruk Pembayaran");
            System.out.println("=================================");
            System.out.println("Jenis Ikan : "+nama);
            System.out.println("Harga Satuan Ikan : Rp. "+harga);
            System.out.println("Berat Ikan : "+berat+" kg");
            System.out.println("Total Harga : Rp. "+(harga * berat));
            System.out.println("=================================");
            System.out.println("Terimakasih atas pembelian Anda");
            System.out.println("=================================");
            System.out.print("Apakah Anda Membeli Lagi? (y/n)");
            ulang = sc.next();
            System.out.println("=================================");
               
        }while(ulang.equalsIgnoreCase("y"));
        System.out.println("OFF");
    }
}
