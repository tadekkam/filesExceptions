public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";
        String fileOutputPath = "D:\\output.txt";

        try {
            FileExample.fileRewrite(filePath, fileOutputPath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
}