import java.util.SplittableRandom;

public class Ogrenci {

    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double  gano;
    private String bolumKodu;
    private int girisSirasi;
    private int dersSayisi;
    private  double dersUcreti;



    public Ogrenci(String ad, String bolum, int girisYili, double gano, String bolumKodu, int girisSirasi, int dersSayisi, double dersUcreti) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrNo;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.girisSirasi= girisSirasi;
        this.dersSayisi=dersSayisi;
        this.dersUcreti= dersUcreti;
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisSirasi){
        this.ad= ad;
        this.bolum= bolum;
        this.gano= gano;
        this.bolumKodu= bolumKodu;
        this.girisYili= 0;
        this.ogrNo= null;

    }
    public Ogrenci(String ad, String bolum, String bolumKodu){
        this.ad= ad;
        this.bolum= bolum;
        this.bolumKodu= bolumKodu;
        this.gano= 0;
        this.girisYili=0;
    }

    public Ogrenci(String ad, String bolum){
        this.ad= ad;
        this.bolum= bolum;
    }

    public Ogrenci(double gano, int girisYili){
        this.gano= gano;
        this.girisYili= girisYili;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }


    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    public double getGano() {
        if (gano <0.0 || gano >4.0){throw new IllegalArgumentException("Gano Değeri 0 ile 4 arasında olmalı! ");}
        return gano;
    }

    public void setGano(double gano) {


        this.gano = gano;
    }

    public double getDersUcreti() {
        return dersUcreti;
    }

    public void setDersUcreti(double dersUcreti) {
        this.dersUcreti = dersUcreti;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public String ogrenciNoOlustur(){

        String formatliGirisSirasi= String.format("%03d",girisSirasi);
        ogrNo= (girisYili + bolumKodu + formatliGirisSirasi);

        if (ogrNo.length()>10){
            if (girisYili > 4){
                throw new IllegalArgumentException("Öğrenci Numarası Oluşturulamadı! Hatalı Giriş Yılı!");
            }
            if (bolumKodu.length() > 3){
                throw new IllegalArgumentException("Öğrenci Numarası Oluşturulamadı! Hatalı Bölüm Kodu!");
            }
            if (girisSirasi > 3){
                throw new IllegalArgumentException("Öğrenci Numarası Oluşturulamadı! Hatalı Giriş Sırası!");

            }
        }
        return ogrNo;

    }

    public double harcHesapla(int dersSayisi, double dersUcreti){
        double harc= dersSayisi*dersUcreti;
        return harc;

    }

    public double harcHesapla(){
        double harc= (dersSayisi*dersUcreti);

        return harc;
    }







}
