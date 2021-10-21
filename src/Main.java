import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();

        if(((mat<=0) || (mat>=100))){
            mat=0;
        }

        if ((fizik<=0) || (fizik>=100)){
            fizik=0;
        }

        if ((turkce<=0 || turkce>=100)){
            turkce=0;
        }

        if (kimya<=0 || kimya>=100){
            kimya=0;
        }

        if (muzik<=0 || muzik>=100){
            muzik=0;
        }

        double ort= (mat+fizik+turkce+kimya+muzik)/5;

        System.out.println("Ortalamanız: "+ort);

        if (ort>=55){
            System.out.println("Geçti !");
        }else{
            System.out.println("Kaldı !");
        }


    }
}
