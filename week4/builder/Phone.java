package week4.builder;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    
    private int battery;
    private String os;
    private int camera;
    private int screensize;
    private int storage;
    
    public Phone(int battery, String os, int camera, int screensize, int storage) {
        this.battery = battery;
        this.os = os;
        this.camera = camera;
        this.screensize = screensize;
        this.storage = storage;

    }

    @Override
    public String toString() {
        return "Phone [battery=" + battery + ", os=" + os + ", camera=" + camera + ", screensize=" + screensize
                + ", storage=" + storage + "]";
    }

    
}
