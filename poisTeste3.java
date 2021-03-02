import java.util.Scanner;

class poisTeste3 {

    public static void main ( String [ ] args ) {

        Scanner scanner = new Scanner (System.in);

        try {

            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                    
                if (num < 1) { 
                    throw new Exception ("conta");
                }
                System.out.println(num + " fixe. ");
            }
        } catch (InputMismatchException e) {
          System.out.println("não pesca.");
        } catch (Exception e) {
          System.out.println("não " + e.getMessage());
        } finally {
          System.out.println("pois.");
        }
    }
}

/* 1.a) O programa recebe um número por input, enquanto houver nºs a serem introduzidos. Lança uma exception caso o nº seja inferior a 1 ( num < 1 ) ou o valor introduzido não for 1 nº. O programa termina sempre que for lançada uma exception e irá sempre imprimir no fim, "pois". 

   1.b) i. 10 fixe; 20 fixe; 30 fixe;
        ii. 2 fixe; 1 fixe; 0 não conta; Pois.
        iii. 1 2 3 fixe; não null; Pois.

   3.a) letras x (INF, GES, MAT, FIS, QUI, PED) = ( t1, t2, t3, t4, t5, t6)
        sequencia numeros: * (entre 0000(*1 *1 *1 *1) e 9999(*10 *10 *10 *10))

        Exemplo: INF0881

        R.: x (0 * * *) ou (pelo estado universitário) = t1(*1 *9 *9 *2)
    
   3.b) 
        INF (*1 *1 *1 *1)
        GES (*n *n *n *n)
        MAT (*n *n *n *n)
        FIS (*n *n *n *n)
        QUI (*n *n *n *n)
        PED (*10 *10 *10 *10)


        while (x=INF || x=GES || x=MAT || x=FIS || x=QUI || x=PED ) 
        
             if ( 0000 < **** < 9999 ) 

   3.c) 

        import java.util.Scanner;
 
class cursoAluno {
    
      public static void main ( String [ ] args ) {
            
             String s1, s2;
             s2 = "mas contente";
             Scanner scanner = new Scanner (System.in);

             System.out.print("Introduza um curso: ");
             s1 = scanner.next ( );

             System.out.print("Inscrito a " + s1 + " " + s2);
            
             System.out.print("\n");

             System.out.println("Inscrito a uma UC do Departamento de " + s1 + " " + s2);
      }
}



    
