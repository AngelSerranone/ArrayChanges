package com.ironhack.main;

public class Main {
    public static void main(String[] args) {
        int[] intList = {5, 4, 3, 2, 1};
        int[] newIntList = new int[5];

        // metodo para crear una nueva lista obtenida de una anterior multiplicando sus elementos por el siguiente, salbvo el ultimo que se multiplica por el primero.
        for (int i = 0; i < intList.length; i++) {
            if (i == intList.length - 1) {
                newIntList[i] = intList[i] * intList[0];
            } else {
                newIntList[i] = intList[i] * intList[i + 1];
            }
            System.out.println(newIntList[i]);
        }

        // metodo para crear una lista que es la inversa de otra dada.
        for (int i = 0; i < intList.length; i++) {
            newIntList[i] = intList[intList.length - i - 1];
            System.out.println(newIntList[i]);
        }
    }
}
