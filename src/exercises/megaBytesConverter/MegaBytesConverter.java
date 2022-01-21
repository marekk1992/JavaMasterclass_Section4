package exercises.megaBytesConverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int numberOfMegaBytes = kiloBytes / 1024;
            int numberOfKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + numberOfMegaBytes
                    + " MB and " + numberOfKiloBytes + " KB");
        }
    }
}
