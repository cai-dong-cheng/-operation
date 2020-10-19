package com.study.number.cpu;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setHardDisk(disk);
        pc.setCup(cpu);
        pc.Show(cpu.speed,disk.amount);
        }

    }

