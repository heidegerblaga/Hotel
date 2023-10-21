package com.polsl.lab1.Controler;

import java.io.*;



public class Controler {
    public static void save(String sciezkaDoPliku, String tekstDoZapisu) {
        try {
            // Tworzenie obiektu FileWriter do zapisu do pliku
            FileWriter fileWriter = new FileWriter(sciezkaDoPliku);

            // Tworzenie obiektu BufferedWriter dla efektywnego zapisu
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Zapisywanie zmiennej do pliku
            bufferedWriter.write(tekstDoZapisu);

            // Zamknięcie strumieni
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Zapisano do pliku: " + sciezkaDoPliku);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String sciezkaDoPliku) {
        try {
            // Tworzenie obiektu FileReader do odczytu pliku
            FileReader fileReader = new FileReader(sciezkaDoPliku);

            // Tworzenie obiektu BufferedReader dla efektywnego odczytu
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }

            // Zamknięcie strumieni
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
