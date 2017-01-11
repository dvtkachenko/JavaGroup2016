package com.brainacad.module2_01.lab;
/**
 * Created by Дима on 01.12.2016.
 */


public class Computer {

    // Lab 2_1_1
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    // Lab 2_1_2

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
// Lab 2_1_5

    public void view() {
        System.out.print("Manufacturer - > " + manufacturer + "; ");
        System.out.print("SerialNumber - > " + serialNumber + "; ");
        System.out.print("Price - > " + price + "; ");
        System.out.print("Quantity CPU - > " + quantityCPU + "; ");
        System.out.println("Frequency CPU - > " + frequencyCPU);
    }
}
