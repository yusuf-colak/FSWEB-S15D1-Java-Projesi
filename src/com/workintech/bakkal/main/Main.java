package com.workintech.bakkal.main;

import com.workintech.bakkal.bakkalList.MarketArabasi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
List<String> lists = new LinkedList<>();
startBakkal(lists);
    }

    public static void startBakkal(List<String> liste) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Yakmak istediğiniz işlemi giriniz:");
                int girilenVeri = scanner.nextInt();
                if (girilenVeri < 0 || girilenVeri > 2) {
                    System.out.println("İşlem 0 ile 2 arasında olmalıdır.");
                }
                if (girilenVeri == 0) {
                    System.exit(0);
                }
                if (girilenVeri == 1) {
                    MarketArabasi.addItems(liste);
                }
               if (girilenVeri == 2) {
                   MarketArabasi.removeItems(liste);
              }
            } catch (Exception ex) {
                System.out.println("Geçersiz veri : " + ex.getMessage());
                System.exit(0);
            }
        }

    }
}
