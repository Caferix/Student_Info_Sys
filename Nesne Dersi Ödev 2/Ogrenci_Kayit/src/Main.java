public class Main {
    public static void main(String[] args) {

        Ogrenci[] ogrenciler= {
                new Ogrenci("Cafer Ceviz","Bilgisayar Mühendisliği", 2023, 3.2, "123",27, 10, 150),
                new Ogrenci("Alan Turing","Matematik", 2020, 4.0, "255",1, 20, 150),
                new Ogrenci("Nicola Tesla","Fizik", 2022, 3.5, "321", 1, 15, 250),
                new Ogrenci("Vincent Van Gogh","Grafik Tasarım", 2021,3.7, "138", 10,20, 100)
        };

        System.out.println("Öğrenci Bilgileri");

        for (int i=0; i< ogrenciler.length; i++) {
            System.out.println(i + 1 + ") " + ogrenciler[i].getAd() + "---" + ogrenciler[i].getBolum() + "---" + ogrenciler[i].ogrenciNoOlustur() + "---" + ogrenciler[i].getGano());

            }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (int j=0; j<ogrenciler.length; j++){
            System.out.println((j+1)+". Öğrencinin Ödeyeceği Harç: "+ ogrenciler[j].harcHesapla(ogrenciler[j].getDersSayisi(), ogrenciler[j].getDersUcreti()));
            }











    }
}
