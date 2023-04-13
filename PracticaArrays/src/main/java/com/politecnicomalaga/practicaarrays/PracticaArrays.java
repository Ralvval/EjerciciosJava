package com.politecnicomalaga.practicaarrays;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticaArrays {

    public static void main(String[] args) {
        ArrayList<Integer> sb = new ArrayList<Integer>();
        sb.add(1);
        sb.add(4);
        sb.add(7);
        sb.add(3);
        sb.add(6);

        System.out.println(sumScores(sb));
        System.out.println(getHighScore(sb));
        System.out.println(average(sb));
        Iterator<Integer> itera = reverseScores(sb).iterator();
        while (itera.hasNext()) {
            Integer elemento = itera.next();
            System.out.print(elemento + " / ");
        }

    
    }
    public static int sumScores(ArrayList<Integer> scoreBoard) {
        int suma = 0;
        for (int x : scoreBoard) {
            suma += x;
        }
        return suma;
    }

    public static int getHighScore(ArrayList<Integer> scoreBoard) {
        int mayor = 0;
        for (int x : scoreBoard) {
            if (mayor < x) {
                mayor = x;
            }
        }
        return mayor;
    }

    public static float average(ArrayList<Integer> scoreBoard) {
        float media = 0;
        float a = scoreBoard.size();
        media = sumScores(scoreBoard) / a;
        return media;
    }

    public static ArrayList<Integer> reverseScores(ArrayList<Integer> scoreBoard) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = scoreBoard.size() - 1; i >= 0; i--) {
            reverse.add(scoreBoard.get(i));
        }
        return reverse;
    }
}
