package com.mycompany.exthree;

class Tv {
    public void on() { System.out.println("TV dang bat..."); }
    public void off() { System.out.println("TV dang tat."); }
}

class SoundSystem {
    public void on() { System.out.println("He thong am thanh dang bat..."); }
    public void setVolume(int level) { System.out.println("Am luong dat muc: " + level); }
}

class DVDPlayer {
    public void on() { System.out.println("Dau DVD dang bat..."); }
    public void play(String movie) { System.out.println("Dang chieu phim: " + movie); }
}

class HomeTheaterFacade {
    private Tv tv;
    private SoundSystem sound;
    private DVDPlayer dvd;

    public HomeTheaterFacade(Tv tv, SoundSystem sound, DVDPlayer dvd) {
        this.tv = tv;
        this.sound = sound;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        System.out.println("Chuan bi xem phim...");
        tv.on();          
        sound.on();       
        sound.setVolume(20);
        dvd.on();          
        dvd.play(movie);
        System.out.println("Chuc ban xem phim vui ve!");
    }
}

public class ExThree {
    public static void main(String[] args) {
        Tv myTV = new Tv(); 
        SoundSystem mySound = new SoundSystem();
        DVDPlayer myDVD = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(myTV, mySound, myDVD);

        homeTheater.watchMovie("Interstellar");
    }
}