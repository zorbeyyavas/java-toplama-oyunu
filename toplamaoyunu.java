import java.util.Random;
import java.util.Scanner;

public class toplamaoyunu {

    public static void main(String[] args) {
          //toplama oyunu 
   Random rnd =new Random();    
    int puan =0;
    int hak=3;
    Boolean kontrol =true;

    while(kontrol){
    Scanner oku=new Scanner(System.in);
    int soru = rnd.nextInt(5)+1;
    int soru2=rnd.nextInt(5)+1;
    int toplam=soru+soru2;
    System.out.print("sorunuz="+soru + "+" +soru2);
    int cevap=oku.nextInt();
    if(cevap==toplam)
    {
     puan=puan+10;   
     System.out.println("puan durumunuz=" +  puan);}

     else{
        System.out.println("hakkınız kalmadı son puan durumunuz="+puan);
        hak--;
        System.out.println("kalan hakkınız="+hak);
        if(hak==0){kontrol=false;}
        }

     if(puan==50){
    kontrol=false;
    boolean kontrol2=true;
    hak=3;
    System.out.println("2.aşamaya geçtiğiniz için hakkınız=3 ");

    while(kontrol2){
        
        Scanner oku2=new Scanner(System.in);
       int soru3 = rnd.nextInt(10)+1;
       int soru4 = rnd.nextInt(10)+1;
       int toplam2=soru3+soru4;
       System.out.print("sorunuz=" +soru3 + "+" +soru4);
       int cevap2=oku2.nextInt();
       if(cevap2==toplam2)
       {
        puan=puan+10;   
        System.out.println("puan durumunuz"+puan);
       }
       else{
        
        hak--;
        System.out.println("kalan hakkınız="+hak);
        if(hak==0){kontrol2=false;}
       }
}
     }
    }
}
}
    
    

