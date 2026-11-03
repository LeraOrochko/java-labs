package org.example;

class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private double price;

    public Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() { return storage; }
    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        }
    }

    public void setStorage(int storage) {
        if (storage > 0) {
            this.storage = storage;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 100) {
            price = price - price * percent / 100;
        }
    }

    public void displayInfo() {
        System.out.println("Ноутбук: " + brand + ", RAM: " + ram + " ГБ" + ", SSD/HDD: " + storage + " ГБ" + ", цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Macbook", 16, 512, 2500.0);
        laptop.displayInfo();
        laptop.applyDiscount(10);
        System.out.println("После скидки 10%:");
        laptop.displayInfo();
        laptop.setPrice(3000.0);
        System.out.println("Новая цена через сеттер: " + laptop.getPrice());
    }
}
