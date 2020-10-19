package com.study.number.cpu;

public class PC {
    CPU cpu ;
    HardDisk HD;
    public void setCup(CPU c) {
        this.cpu = c;
    }
    public void setHardDisk(HardDisk h) {
        this.HD = h;
    }
    public void Show(int speed,int amount){
        System.out.println("cpu的速度" + speed + ",HardDisk的容量" + amount);
    }
}
