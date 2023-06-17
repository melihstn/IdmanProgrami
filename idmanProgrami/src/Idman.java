public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_Sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_Sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_Sayisi = situp_Sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_Sayisi() {
        return situp_Sayisi;
    }

    public void setSitup_Sayisi(int situp_Sayisi) {
        this.situp_Sayisi = situp_Sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public void hareketYap(String haraketTuru, int sayi){
        if (haraketTuru.equals("Burpee")){
            burpeeYap(sayi);

        }else if(haraketTuru.equals("Pushup")){
            pushupYap(sayi);

        }else if(haraketTuru.equals("Situp")){
            situpYap(sayi);

        }else if(haraketTuru.equals("Squat")){
            squatYap(sayi);

        }else {
            System.out.println("Geçersiz hareket....");

        }

    }
    public void burpeeYap(int sayi){

        if(burpee_sayisi == 0) {
            System.out.println("Yapacak burpee kalmadı...");
        }
        if(burpee_sayisi - sayi < 0 ){
            System.out.println("Hedeflediğin burpee sayısını geçtin.. Tebrikler!");
            burpee_sayisi = 0;
            System.out.println("Kalan burpee : " + burpee_sayisi);

        }else {

            burpee_sayisi -= sayi;
            System.out.println("Kalan burpee sayısı : " + burpee_sayisi);

        }

    }
    public void situpYap(int sayi){

        if(situp_Sayisi == 0) {
            System.out.println("Yapacak situp kalmadı...");
        }
        if(situp_Sayisi - sayi < 0 ){
            System.out.println("Hedeflediğin pushup sayısını geçtin.. Tebrikler!");
            situp_Sayisi = 0;
            System.out.println("Kalan burpee : " + situp_Sayisi);

        }else {

            situp_Sayisi -= sayi;
            System.out.println("Kalan burpee sayısı : " + situp_Sayisi);

        }

    }
    public void pushupYap(int sayi){

        if(pushup_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(pushup_sayisi - sayi < 0 ){
            System.out.println("Hedeflediğin pushup sayısını geçtin.. Tebrikler!");
            pushup_sayisi = 0;
            System.out.println("Kalan burpee : " + pushup_sayisi);

        }else {

            pushup_sayisi -= sayi;
            System.out.println("Kalan burpee sayısı : " + pushup_sayisi);

        }

    }
    public void squatYap(int sayi){

        if(squat_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(squat_sayisi - sayi < 0 ){
            System.out.println("Hedeflediğin squat sayısını geçtin.. Tebrikler!");
            squat_sayisi = 0;
            System.out.println("Kalan burpee : " + squat_sayisi);

        }else {

            squat_sayisi -= sayi;
            System.out.println("Kalan burpee sayısı : " + squat_sayisi);

        }

    }
    public boolean idmanBittiMi(){

        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_Sayisi == 0) && (squat_sayisi == 0);
    }


}































