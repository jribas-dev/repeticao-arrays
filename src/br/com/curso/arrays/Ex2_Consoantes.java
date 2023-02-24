/**
* <h1>Consoantes e Vogais</h1>
* Transformei esse exercicio de forma mais interessante
* você informa uma palavra ou frase e o programas vai dizer
* quantas consoantes e quantas vogais existem na palavra ou frase
* informada.
* <p>
* <b>Nota:</b> Vogais acentuadas são identificadas como vogais,
* espaços em branco são descartados.
*
* @author  jribas-dev
* @version 1.0
* @since   24/02/2023
*/

package br.com.curso.arrays;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        ArrayList<String> consoantes = new ArrayList<>();
        ArrayList<String> vogais = new ArrayList<>();

        System.out.println("Palavra: ");
        String palavra = scan.nextLine();
        ArrayList<String> letras = new ArrayList<>(Arrays.asList(palavra.split("")));

        final Collator instance = Collator.getInstance();
        instance.setStrength(Collator.PRIMARY);
        
        int count = 0;
        do {

            if ( !( instance.compare(letras.get(count), "a") == 0 ||
            		instance.compare(letras.get(count), "e") == 0 ||
            		instance.compare(letras.get(count), "i") == 0 ||
            		instance.compare(letras.get(count), "o") == 0 ||
            		instance.compare(letras.get(count), "u") == 0) ) {
            	if ((! consoantes.contains(letras.get(count))) &&
            	    (! Character.isWhitespace(letras.get(count).charAt(0)) ))
            		consoantes.add(letras.get(count));
            }
            else {
            	if ( ! vogais.contains(letras.get(count)) )
            		vogais.add(letras.get(count));
            }
            count++;

        } while(count < letras.size());

        System.out.println("Consoantes: ");
        for ( String consoante  : consoantes ) {
        	System.out.print(consoante + " ");
        }

        System.out.println("\nVogais: ");
        for ( String vogal  : vogais ) {
        	System.out.print(vogal + " ");
        }

        System.out.println("\n----------------------------------");
        System.out.println("Quantidade de consoantes: " + consoantes.size());
        System.out.println("Quantidade de vogais:     " + vogais.size());

    }

}