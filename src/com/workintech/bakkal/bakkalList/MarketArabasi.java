package com.workintech.bakkal.bakkalList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarketArabasi {


    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void addItems(List<String> lists) {
        System.out.println("Eklenmesini istediğiniz elemanları giriniz: ");
        String input = getInput();

        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null && !element.trim().isEmpty()) {
                    if (!checkItemIsInList(lists, element)) {
                        lists.add(element.trim());
                    }
                }
            }

        } else {
            if (input != null && !input.isEmpty()) {
                lists.add(input);
            }
        }
        ekranaListele(lists);
    }

    public static void removeItems(List<String> lists) {
        System.out.println("Çıkartılması istediğiniz elemanları giriniz: ");
        String input = getInput();

        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null && !element.trim().isEmpty()) {
                    if (checkItemIsInList(lists, element)) {
                        lists.remove(element.trim());
                    }
                }
            }

        } else {
            if (input != null && !input.isEmpty()) {
                lists.remove(input);
            }
        }
        ekranaListele(lists);
    }


    public static boolean checkItemIsInList(List<String> urunler, String urun) {
        return urunler.contains(urun.trim());
    }

    public static void ekranaListele(List<String> urunler) {
        Collections.sort(urunler);
        for (String urun : urunler) {
            System.out.println(urun);
        }

    }

}
