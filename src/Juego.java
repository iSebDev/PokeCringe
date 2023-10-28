import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    public static Scanner scanner = new Scanner(System.in);

    public static void println(String string) {
        System.out.println(string);
    }

    private static List<Object[]> pokemons = new ArrayList<>();

    public static void getPokemons() throws FileNotFoundException {
        File f = new File("src/pokemoninfo.txt");
        f.setReadable(true);
        Scanner scanFile = new Scanner(f);
        while (scanFile.hasNextLine()) {
            if (scanFile.nextLine().startsWith("//")) continue;
            else if (scanFile.nextLine().split(":").length > 1) {

            }
        }
    }

    public static void main(String[] args) {
        try {
            getPokemons();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}