public class MegaBytesConveter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int conversion = kiloBytes;
            int megaByte = (conversion / 1024);
            int remainder = (conversion % 1024);
            System.out.println(conversion + " KB = " + megaByte + " MB and " + remainder + " KB");
        }

    }
}
