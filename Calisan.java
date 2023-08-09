public class Calisan {

    private String ad;
    private String soyad;
    private int id;
    private int maaş;
    
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getAd(){
        return ad;
    }

    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getSoyad(){
        return soyad;
    }

    public void setİd(int id){
        this.id=id;
    }
    public int getİd(){
        return id;
    }
    
    public void setMaaş(int maaş){
        this.maaş=maaş;
    }
    public int getMaaş(){
        return maaş;
    }


    public Calisan(String ad,String soyad,int id,int maaş){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
        this.maaş=maaş;
    }
    
    public void Bilgileri_göster(){
        System.out.println("ÇALIŞAN BİLGİLERİ GÖSTERİLİYOR");
        System.out.println("ÇALIŞAN ADI="+this.ad);
        System.out.println("ÇALIŞAN SOYADI="+this.soyad);
        System.out.println("ÇALIŞAN İD="+this.id);
        System.out.println("ÇALIŞANIN ALDIĞI MAAŞ="+this.maaş);
    }







}
