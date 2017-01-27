package com.brainacad.module2_07.lab;

/**
 * Created by Дима on 25.01.2017.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}

class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", price=" + super.getPrice() +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}

    class EthernetAdapter extends Device {
        private int speed;
        private String mac;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        @Override
        public String toString() {
            return "EthernetAdapter{" +
                    "manufacturer='" + super.getManufacturer() + '\'' +
                    ", price=" + super.getPrice() +
                    ", serialNumber='" + super.getSerialNumber() + '\'' +
                    "speed=" + speed +
                    ", mac='" + mac + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            EthernetAdapter that = (EthernetAdapter) o;

            if (speed != that.speed) return false;
            return mac != null ? mac.equals(that.mac) : that.mac == null;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + speed;
            result = 31 * result + (mac != null ? mac.hashCode() : 0);
            return result;
        }
    }

