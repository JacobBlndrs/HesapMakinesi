import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp=new Scanner(System.in);

        System.out.print("Ilk Sayiyi Giriniz : ");
        n1=inp.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2=inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma");
        select=inp.nextInt();
        System.out.println("Seciminiz : "+" "+select);

        switch (select){
            case 1:
                System.out.print("Toplam :"+""+(n1+n2));
            break;
            case 2:
                System.out.println("Cikarma"+""+(n1-n2));
                break;
            case 3:
                if (n2!=0)
                System.out.print("Bolme : "+""+(n1/n2));
                else
                    System.out.print("Hatali deger girdiniz."+n1+"sayisi 0'a bolunmez.");
                break;
            case 4 :
                System.out.print("Carpma : "+""+(n1*n2));
                break;
            default:
                System.out.println("Hata!!1-4 araliginda deger seciniz.");
        }


    }
}
