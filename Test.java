import java.util.Scanner;

public class Test {

    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.println("ÇALIŞANLAR UYGULAMASINA HOŞGELDİNİNZ.....");
    String islemler="İŞLEMLER...../n"
                    +"1.YAZILIMCI İŞLEMLERİ/n"
                    +"2.YÖNETİCİ İŞLEMLERİ/n"
                    +"3.ÇIKMAK İÇİN Q YA BASINIZ";
    
    System.out.println("*************************************");
    System.out.println(islemler);
    System.out.println("*************************************");

    while(true){
 
        System.out.println("LÜTFEN İŞLEMİ SEÇİNİZ");
        String secim=scanner.nextLine();

        if (secim.equals("q")){
            System.out.println("PROGRAMDAN ÇIKILIYOR");
            break;
        }

        else if (secim.equals("1")){
            Yazilimci yazilimci=new Yazilimci("Buğrahan","ERTAŞ",12345, 500,"PYTHON,JAVA,C");
            String işlemler="İŞLEMLER......../n"
                            +"1.BİLGİLERİ GÖSTER/n"
                            +"2.ÇIKMAK İÇİN Q YA BASINIZ";
            
            System.out.println("******************************");
            System.out.println(işlemler);
            System.out.println("******************************");
            
            while(true){

                System.out.println("LÜTFEN İŞLEM SEÇİNİZ");
                String işlem=scanner.nextLine();
            
                if (işlem.equals("1")){
                    yazilimci.Bilgileri_göster();
                }
                else if (islemler.equalsIgnoreCase("q")){
                    System.out.println("PROGRAMDAN ÇIKILIYOR");
                    break;
                }
            }
        }
        else if (secim.equals("2")){
            Yönetici yönetici=new Yönetici("Buğrahan","Ertaş", 12345, 500, 20);
            
            String islem="İŞLEMLER........./n"
                            +"1.İŞLEM ZAM YAP/n"
                            +"2.BİLGİLERİ GÖSTER/n"
                            +"3.ÇIKMAK İÇİN Q YA BASINIZ ";
            System.out.println("*********************************");
            System.out.println(islem);
            System.out.println("**********************************");
            
            while (true){

                System.out.println("LÜTFEN İŞLEMİ SEÇİNİZ");
                String seçim=scanner.nextLine();
                if (seçim.equals("q")){
                    System.out.println("PROGRAMDAN ÇIKILIYOR");
                    break;
                }

                else if (seçim.equals("1")){
                System.out.println("YÖNETİCİNİN NE KADAR ZAM YAPMASINI İSTİYORSUNUZ");
                int zam=scanner.nextInt();
                scanner.nextLine();
                yönetici.zam_yap(zam);
                
                }

                else if (seçim.equals("2")){
                    yönetici.Bilgileri_göster();
                }
                else{
                    System.out.println("GEÇERSİZ İŞLEM");
                }
            }

            





    }


    else{
        System.out.println("GEÇERSİZ İŞLEM");
    }
  

}
    

}
}
