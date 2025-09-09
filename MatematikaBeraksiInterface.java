
interface OperasiMatematika {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

class MatematikaInterface implements OperasiMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }
}

public class MatematikaBeraksiInterface {
    public static void main(String[] args) {
        OperasiMatematika mtk = new MatematikaInterface();

        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + mtk.pembagian(21, 2));
    }
}
