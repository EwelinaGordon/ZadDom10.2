import java.util.Scanner;

public class Way {
    public static void main(String[] args) {
        System.out.println("Wykaz kierunków: ");

        for(Earth earth: Earth.values()) {
            System.out.println(earth.toString());
            }

        System.out.println("W jakim kierunku chcesz się poruszać?");

        Direction drc = new Direction();
        Scanner scn = new Scanner(System.in);
        String kierunek = scn.nextLine();
        try {
            drc.setEarth(Earth.valueOf(kierunek));
            System.out.println("Ok więc jedziemy na " + drc.getEarth().getDescription());
        } catch (IllegalArgumentException ex) {
            System.out.println("Nie ma takiego kierunku: " +kierunek);
        }
    }

}

 