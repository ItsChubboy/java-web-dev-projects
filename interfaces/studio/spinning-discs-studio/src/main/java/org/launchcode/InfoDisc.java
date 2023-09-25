package org.launchcode;

public class InfoDisc {
    double diameter;
    String discType;
    String format;
    String storageCapacity;
    String title;
    Integer[] rpm;
    boolean readyToUse = false;

    public InfoDisc(String title, String discType, double diameter, String format, String storageCapacity) {
        this.title = title;
        this.discType = discType;
        this.diameter = diameter;
        this.format = format;
        this.storageCapacity = storageCapacity;
    }
    public String getFormat() {
        return format;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }



    public Integer[] getRpm() {
        return rpm;
    }

    void reformat(String newFormat) {
        setFormat(newFormat);
        System.out.println("Your disc has been reformatted to" + newFormat);
    }


}
