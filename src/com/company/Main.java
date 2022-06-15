package com.company;

public class Main {

    public static void main(String[] args) {
         class Kot {
            public String imie;
            public int waga;
            public int wiek;
            public String kolor;
            public String adres;

            public void inicjalizuj(String imie){
                this.imie = imie;
                this.waga = 3;
                this.wiek = 4;
                this.kolor = "szary";
            }
            public void inicjalizuj(String imie, int waga, int wiek){
                this.imie = imie;
                this.waga = waga;
                this.wiek = wiek;
                this.kolor = "szary";
            }
            public void inicjalizuj(String imie, int wiek){
                this.imie = imie;
                this.waga = 3;
                this.wiek = 4;
                this.kolor = "szary";
            }
            public void inicjalizuj(int waga, String kolor){
                this.waga = waga;
                this.wiek = 4;
                this.kolor = kolor;
            }
            public void inicjalizuj(int waga, String kolor, String adres){
                this.waga = waga;
                this.wiek = 4;
                this.kolor = kolor;
                this.adres = adres;
            }

            public void main(String[] args) {

            }
        }

    }
}
