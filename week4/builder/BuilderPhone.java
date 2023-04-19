package week4.builder;

public class BuilderPhone {
    private int battery;
    private String os;
    private int camera;
    private int screensize;
    private int storage;

    public BuilderPhone setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public BuilderPhone setOs(String os) {
        this.os = os;
        return this;
    }
    public BuilderPhone setCamera(int camera) {
        this.camera = camera;
        return this;
    }
    public BuilderPhone setScreensize(int screensize) {
        this.screensize = screensize;
        return this;
    }
    public BuilderPhone setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Phone getPhone(){
        return new Phone(battery, os, camera, screensize, storage);
    }
    
    
}
