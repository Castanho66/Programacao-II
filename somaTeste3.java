import java.util.Scanner;

class somaTeste3 {

    public static void main ( String [ ] args ) {

        Scanner scanner = new Scanner (System.in);
        int soma = 0;

        try {
            while (scanner.hasNext( )) {
                int num = scanner.nextInt ( );
                
                if (num > 10) 
                    throw new ArithmeticException ("enorme");
                else if (num <= 0) 
                    throw new ArithmeticException ("minusculo");
                soma = soma + num;
    
                System.out.println ("passou: " + num);
            }
        } catch (ArithmeticException e) {
          System.out.println ("conta " + e.getMessage());
        } catch (Exception e) {
          System.out.println ("problema " + e.getMessage());
        } finally {
          System.out.println (soma);
        }
    }
}

/* 1.a) O programa aceita um int para a soma final, e vai incrementando essa mesma até que não seja gerada nenhuma exceção e o print final seja dado pela soma em si. Isto claro, sempre que houver um inteiro seguinte, esse inteiro vai sendo incrementado ao contador soma.

     b)i. Sendo que 20 é superior a 10, logo é enorme e 0 é inferior ou igual a si mesmo, logo é minúsculo, a sequência 2 1 0 10 20 , representa no final: 2+1+(0 gera uma excepção mas como se incrementa usando o soma = soma + num , a soma também depende do 0) + 10 + (Como o 20 gera uma exceção de overflow visto se encontrar além do disponivel, não se incrementa à soma. O output será: soma = 2+1+0+10 = 13

    b)ii. 


    2)   ____________________________________
        |                                    |    
        |                                    |
        v                                    |
      vale             s2      (Compare)     s1
    tipo:int <--- tipo:string  <-------> tipo:string   
                  nome:"Javascript"      nome:"Kotlin"


    3.a) letra = x (L, M, D, EX -> t1, t2, t3, t4)
         sequencia letras/numeros: * (entre 1 e 99999)

        Exemplo: L42412 

        R.: x***** ou (pelo estado universitário) -> t1*5*3*5*2*3

    3.b) nome de utilizador: L, M, D, EX *****

        L *1*1*1*1*1
        M *n*n*n*n*n
        D *n*n*n*n*n
        EX *99999*99999*99999*99999*99999

        while (x=L || x=M || x=D || x=EX)
            if(00000 < * < 99999)

    3.c) import java.util.Scanner;

            class nomeUtilizador {
    
                public static void main ( String [ ] args ) {
            
                    string s1;
                    Scanner scanner = new Scanner (System.in);

                    System.out.println("Introduza uma palavra: ");
                    s1 = scanner.next ( );

                    System.out.print("A sua palavra é: " + s1 );
                }
            }

     3.d)

