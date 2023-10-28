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

    private static List<String[]> pokemons = new ArrayList<>();

    public static void getPokemons() throws FileNotFoundException {
        File f = new File("src/pokemoninfo.txt");
        f.setReadable(true);
        Scanner scanFile = new Scanner(f);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();

            if (line.startsWith("//")) continue;
            else if (line.split(":").length > 1) {
                pokemons.add(line.split(":"));
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