import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        List<String> español = new ArrayList<>();
        List<String> ingles = new ArrayList<>();
        int contador = 0;

        español.add("casa");
        español.add("cocodrilo");
        español.add("jugo");
        español.add("fresa");
        español.add("canción");
        español.add("pirata");
        español.add("vidrio");
        español.add("jugar");
        español.add("computador");
        español.add("billetera");
        español.add("francia");

        ingles.add("house");
        ingles.add("cocodrile");
        ingles.add("juice");
        ingles.add("strawberry");
        ingles.add("song");
        ingles.add("pirate");
        ingles.add("glass");
        ingles.add("play");
        ingles.add("computer");
        ingles.add("wallet");
        ingles.add("france");

        for (int i = 0; i < español.size(); i++) {
            diccionario.put(español.get(i), ingles.get(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Listo para jugar escribe la traduccion de cada palabra");
        int totalPalabras = español.size();
        List<Integer> numerosPrevios = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int aleatorio;

            do {
                aleatorio = new Random().nextInt(totalPalabras);
            } while (numerosPrevios.contains(aleatorio));

            numerosPrevios.add(aleatorio);
            String palabra = español.get(aleatorio);
            System.out.println("Tu palabra es: " + palabra);
            String respuesta = sc.next().toLowerCase();

            if (respuesta.equalsIgnoreCase(ingles.get(aleatorio))) {
                contador++;
            }
        }

        System.out.println("Adivinaste " + contador + " palabras");
    }
}
