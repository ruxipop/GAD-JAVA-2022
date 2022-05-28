package curs8;

public class File {
    public static void ex1(String[] args) throws java.io.IOException {
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("/Users/popruxi/Desktop/an3sem2/GAD-JAVA-2022/src/curs8/input.txt"));
            String line = br.readLine();
            int max = line.length();
            String lineMax = line;
            while (line != null) {
                if (line.length() > max) {
                    max = line.length();
                    lineMax = line;
                }
                line = br.readLine();
            }
            System.out.println(lineMax);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws java.io.IOException {
        java.nio.file.Path filePath = java.nio.file.Paths.get("/Users/popruxi/Desktop/an3sem2/GAD-JAVA-2022/src/curs8/input.txt");

        try (java.util.stream.Stream<String> lines = java.nio.file.Files.lines(filePath))
        {

           String filteredLines = lines
                    .max((x,y)->x.length() > y.length() ? 1 : -1)
                    .get();

        System.out.println(filteredLines);

        }


    }
}
