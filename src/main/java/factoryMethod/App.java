package factoryMethod;

import abstractFactory.Factory;
import abstractFactory.FactoryEnglish;
import abstractFactory.FactoryUkraine;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("select figure type : \n" +
                "1 - Line figure \n" +
                "2 - Square figure \n" +
                "3 - Triangle figure");
        Scanner scanner = new Scanner(System.in);
        int userFigure = scanner.nextInt();
        switch (userFigure) {
            case 1 :
                Dialog dialog = new LineDialog();
                dialog.createFigure().appeared();
                break;
            case 2 :
                dialog = new SquareDialog();
                dialog.createFigure().appeared();
                break;
            case 3 :
                dialog = new TriangleDialog();
                dialog.createFigure().appeared();
                break;
            default:
                System.out.println("incorrect data");
        }
    }
}
