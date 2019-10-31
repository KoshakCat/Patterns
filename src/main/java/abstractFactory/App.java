package abstractFactory;

import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("select film with : \n" +
                "1 - Ukraine track \n" +
                "2 - English track");
        Scanner scanner = new Scanner(System.in);
        int userFilm = scanner.nextInt();
        switch (userFilm) {
            case 1 :
                Factory ukraineFactory = new FactoryUkraine();
                ukraineFactory.createAudio().playAudio();
                ukraineFactory.createSubtitle().showSubtitles();
                break;
            case 2 :
                Factory englishFactory = new FactoryEnglish();
                englishFactory.createAudio().playAudio();
                englishFactory.createSubtitle().showSubtitles();
                break;
            default:
                System.out.println("incorrect data");
        }
    }
}
