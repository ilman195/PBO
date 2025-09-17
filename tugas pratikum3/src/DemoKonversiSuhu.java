class KonversiSuhu {
    public double celciusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public double celciusToReamur(double c) {
        return c * 4/5;
    }
}

class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double f) {
        return (f - 32) * 4/9;
    }
}

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konv = new KonversiSuhu2();

        double c = 100;
        double f = konv.celciusToFahrenheit(c);
        double r = konv.celciusToReamur(c);
        double fr = konv.fahrenheitToReamur(f);

        System.out.println(c + " Celcius = " + f + " Fahrenheit");
        System.out.println(c + " Celcius = " + r + " Reamur");
        System.out.println(f + " Fahrenheit = " + fr + " Reamur");
    }
}
