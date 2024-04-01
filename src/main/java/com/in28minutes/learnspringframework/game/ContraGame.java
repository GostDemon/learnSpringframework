package com.in28minutes.learnspringframework.game;

public class ContraGame implements GamingConsole{

    public void up() {
        System.out.println( "Jump");
    }

    public void down() {
        System.out.println("Lay Down");
    }

    public void left(){
        System.out.println("Go back to defend");
    }

    public void right() {
        System.out.println("Fire Bullets");
    }
}
