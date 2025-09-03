package robot;

import java.util.Scanner;

abstract class Robot {
    protected String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void speak(String input);
}

class bot_upin_ipin extends Robot {
    public bot_upin_ipin(String name) {
        super(name);
    }

    @Override
    public void speak(String input) {
        System.out.println(name + ": Senang bertemu denganmu Kamu");
    }
}

class upin extends Robot {
    public upin(String name) {
        super(name);
    }

    @Override
    public void speak(String input) {
        System.out.println(name + ": hy \n perkenalkan nama saya : upin. \n warna saya : hijau. \n berat saya : 25");
    }           
}

class ipin extends Robot {
    public ipin(String name) {
        super(name);
    }

    @Override
    public void speak(String input) {
        System.out.println(name + ": hy \n perkenalkan nama saya : ipin. \n warna saya : biru. \n berat saya : 25");
    }
}

public class RobotApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          
            Robot[] robots = {
                new bot_upin_ipin("upin dan ipin"),
                new upin("upin"),
                new ipin("ipin")
            };
            
            System.out.println("=== menu ===");
            System.out.print("hallo perkenalkan nama kamu : ");
            String userName = scanner.nextLine();
            
            String input;
            do {
                System.out.println("\nHalo, " + userName + "! ketik 'menu' untuk mengenal upin ipin? (ketik 'keluar' untuk berhenti)");
                input = scanner.nextLine();
                
                if (!input.equalsIgnoreCase("keluar")) {
                    for (Robot robot : robots) {
                        robot.speak(input);
                    }
                }
            } while (!input.equalsIgnoreCase("keluar"));
            
            System.out.println("Terima kasih sudah berbicara dengan robot-robot kami!");
        }
    }
}
