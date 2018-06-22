import java.util.Scanner;

public class Way {
    public static void main(String[] args) {
        System.out.println("Wykaz kierunków: ");

        for(Earth earth: Earth.values()) {
            System.out.println(earth.toString());
        }

        System.out.println("W jakim kierunku chcesz się poruszać?");

        Scanner scn = new Scanner(System.in);
        Earth earth = Earth.valueOf(scn.nextLine());

        System.out.println("Ok więc jedziemy na " + earth.getDescription());

        System.out.println();

    }
}

 