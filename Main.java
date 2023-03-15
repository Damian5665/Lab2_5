import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner wybor = new Scanner(System.in);  
    System.out.println("1 - Policz pole prostokta. 2- Policz pole 3 - losowe liczby i srednia 4- mediana");
    int i = wybor.nextByte();
    
    switch(i)
      {
        case 1:
          {
            int a,b;
            System.out.println("Wpisz a");
            a = wybor.nextByte();
            System.out.println("Wpisz b");
            b = wybor.nextByte();
            int pole = a*b;
            System.out.println("Pole prostokata o bokach "+ a +","+ b + " wynosi: " + pole);
          }
        case 2:
          {
            double a,h;
            System.out.println("Wpisz a");
            a = wybor.nextByte();
            System.out.println("Wpisz h");
            h = wybor.nextByte();
            double pole = 0.5*a*h;
            System.out.println("Pole trojkata wynosi: " + pole);
          }
        case 3:
          {
            int[] x = new int[10];
            int l,s=0;
            Random rand = new Random();
            for(l=0;i<11;i++)
              {
                x[l] = rand.nextInt(101);
                System.out.println(x[l]);
                s = s + x[l];
              }
            double sr = s/10;
            System.out.println(sr);
          }
        case 4:
          {
            int[] x = new int[10];
            int l;
            Random rand = new Random();
            for(l=0;i<11;i++)
              {
                x[l] = rand.nextInt(101);
                System.out.println(x[l]);
              }
            Arrays.sort(numArray);
            double mediana;
            if (numArray.length % 2 == 0)
                mediana = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
            else
                mediana = (double) numArray[numArray.length/2];
            System.out.println(mediana);
          }
      }
  }
}