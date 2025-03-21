package com.example.myapp;

public class Pushpa {
    void Clip(Clip[] clips) {
        if (clips != null) {
            System.out.println("Pushpa is running");


            for (Clip clip : clips) {
                if (clip != null) {
                    clip.hold();
                }
            }
        } else {
            System.out.println("Null");
        }
    }
}
