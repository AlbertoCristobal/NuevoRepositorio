package com.ufv.holamundo;

public class HolaMundo {



    public static void main(String[] args) {

        for (int i = 0 ; i <= 5 ; i++){
            System.out.println(ANSI_RED + "Hola Mundo!"+ ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Hola Mundo!"+ ANSI_RESET);

        }

    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}
