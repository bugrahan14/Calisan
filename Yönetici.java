public class Yönetici extends Calisan {

    private int sorumlu_kişi;
    public Yönetici(String ad,String soyad,int id,int maaş,int sorumlu_kişi){
        super(ad,soyad,id,maaş);
        this.sorumlu_kişi=sorumlu_kişi;
    }

    public void setSorumlu_kişi(int  sorumlu_kişi){
        this.sorumlu_kişi=sorumlu_kişi;
    }
    public int GetSorumlu_kişi(){
        return sorumlu_kişi;
    }

    public void Bilgileri_göster(){
        super.Bilgileri_göster();
        System.out.println("SORUMLU OLUNAN KİŞİ SAYISI="+this.sorumlu_kişi);
    }
    public void zam_yap(int x){
        System.out.println(getAd()+"ÇALIŞANININA"+x+"MİKTARDA ZAM YAPILDI");

    }
    
}
