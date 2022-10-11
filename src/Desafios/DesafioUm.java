package Desafios;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {

        int xi = Integer.parseInt(new Scanner(System.in).nextLine());
        int etapas = 0;
        int x = xi;


        while (x != 0) {
            if (x % 2 == 0) {

                x = x / 2;
                ++etapas;
            } else {

                x = x - 1;
                ++etapas;
            }
        }
        System.out.println(etapas);
    }
}