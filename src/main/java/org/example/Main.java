public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\data.txt";
        String textFind = "JAVA";

        try {
            boolean isTextFind = FileExample.isTextInFile(filePath, textFind);
            System.out.println(isTextFind);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}