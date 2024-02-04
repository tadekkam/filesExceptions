public class Main {
    public static void main(String[] args) {

        try {
            FileExample.filePrintReverse(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}