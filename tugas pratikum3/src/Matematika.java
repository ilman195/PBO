class Matematika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }
}

class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        return a % b;
    }
}

class MatematikaInheritance {
    Matematika matematika = new Matematika();
    Matematika2 matematika2 = new Matematika2();

    public void panggilSemuaMethod(int a, int b) {
        System.out.println("Tambah: " + matematika.tambah(a, b));
        System.out.println("Kurang: " + matematika.kurang(a, b));
        System.out.println("Modulus: " + matematika2.modulus(a, b));
    }
}
