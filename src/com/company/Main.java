package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери день недели!\nDyishomby, Shershembi, Sharshembi, " +
                "Beyshembi, Juma, Ishembi, Jekshembi");
        String weeks = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (weeks) {
                case "dyishomby":
                    System.out.println(Jumalar.DYIHOMBY + " Lekciya");
                    break;
                case "shershembi":
                    System.out.println(Jumalar.SHERSHEMBI + " Praktika");
                    break;
                case "sharshembi":
                    System.out.println(Jumalar.SHARSHEMBI + " Lekciya");
                    break;
                case "beyshembi":
                    System.out.println(Jumalar.BEYSHEMBI + " Praktica");
                    break;
                case "juma":
                    System.out.println(Jumalar.JUMA + " Lekciya");
                    break;
                case "ishembi":
                    System.out.println(Jumalar.ISHEMBI + " Dop zaniatiya");
                    break;
                case "jekshembi":
                    System.out.println(Jumalar.JEKSHEMBI + " Svobodnoe poseshenie!");
                default:
                    System.out.println("Ne vihodi za ramki menuy!");
            }

    }
}
