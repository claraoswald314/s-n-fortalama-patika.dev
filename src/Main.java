import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();

        if(0<= mat && mat<=100){
            System.out.println("Fizik notunuz : ");
            fizik = input.nextInt();
            if(0<= fizik && fizik<=100){
                System.out.println("Türkçe notunuz : ");
                turkce = input.nextInt();
                if(0<= turkce && turkce<=100){
                    System.out.println("Kimya notunuz : ");
                    kimya = input.nextInt();
                    if(0<= kimya && mat<=kimya){
                        System.out.println("Müzik notunuz : ");
                        muzik = input.nextInt();
                        if(0<= muzik && muzik<=100){
                            double avarage = (mat+fizik+kimya+muzik+turkce)/5;
                            System.out.println("ortalamanız : "+ avarage);
                            if(avarage<50){
                                System.out.println("sınıfta kaldınız");
                            }else {
                                System.out.println("sınıfı geçtiniz");
                            }

                        }else{
                            System.out.println("hatalı girş yaptınız lütfen 0 ile 100 arasında not giriniz");

                        }

                    }else{
                        System.out.println("hatalı girş yaptınız lütfen 0 ile 100 arasında not giriniz");
                    }

                }else{
                    System.out.println("hatalı girş yaptınız lütfen 0 ile 100 arasında not giriniz");
                }

            }else {
                System.out.println("hatalı girş yaptınız lütfen 0 ile 100 arasında not giriniz");
            }

        }else{
            System.out.println("hatalı girş yaptınız lütfen 0 ile 100 arasında not giriniz");
        }




    }
}
