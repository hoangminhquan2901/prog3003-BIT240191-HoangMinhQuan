/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
interface MediaPlayer{
    void play(String audioFile, String fileName);
}

class VlcPlayer {
    public void playvlc(String fileName) {
        System.out.println("Dang phat file VLC: " + fileName);
    }
}
class MediaAdapter implements MediaPlayer{
    private VlcPlayer vlcPlayer;
    public MediaAdapter(){
        this.vlcPlayer = new VlcPlayer();
    }
    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playvlc(fileName);
        }
    }
}
public class Ex2 {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("vlc", "l");
    }
}
