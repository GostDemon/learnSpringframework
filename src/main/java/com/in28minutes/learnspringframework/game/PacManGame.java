package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole {
    public void up() {
        System.out.println( "Go up");
    }

    public void down() {
        System.out.println("Go Down");
    }

    public void left(){
        System.out.println("Move left to escape");
    }

    public void right() {
        System.out.println("Move Right to escape");
    }
}
