public class Yazilimci extends Calisan {

    private String diller;

    public Yazilimci(String ad,String soyad,int id,int maaş,String diller){
        super(ad,soyad,id,maaş);
        this.diller=diller;
    }
    public void setDiller(String diller){
        this.diller=diller;
    }
    public String getDiller(){
        return diller;
    }

    public void Bilgileri_göster(){
       // BURADA UZUNCA TEK TEK BİLGİLER YAZILABİLRİDİ FAKAT KISALTMAK ADINA super. KULLANILDI.
         /* System.out.println("ÇALIŞAN BİLGİLERİ GÖSTERİLİYOR");
            System.out.println("ÇALIŞAN ADI="+this.ad);
            System.out.println("ÇALIŞAN SOYADI="+this.soyad);
            System.out.println("ÇALIŞAN İD="+this.id);
            System.out.println("ÇALIŞANIN ALDIĞI MAAŞ="+this.maaş);*/  


        super.Bilgileri_göster();
        System.out.println("YAZILIMCININ BİLDİĞİ DİLLER :"+this.diller);
    }













}
