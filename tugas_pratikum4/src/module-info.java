abstract class BangunRuang {
    abstract double volume();
    abstract double luasPermukaan();
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        BangunRuang balok = new Balok(4, 3, 2);
        BangunRuang kubus = new Kubus(5);       

        System.out.println("=== Balok ===");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.luasPermukaan());

        System.out.println("\n=== Kubus ===");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
    }
}
