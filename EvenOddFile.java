import java.io.*;

public class EvenOddFile {
    public static void main(String[] args) {
        try {
            // Reading input file
            FileReader fr = new FileReader("integers.txt");
            BufferedReader in = new BufferedReader(fr);

            // Writing output files
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            String line = in.readLine();

            // Process each line
            while (line != null) {
                int num = Integer.parseInt(line);

                if (num % 2 == 0) { // ✅ fixed
                    evenWriter.write(num + "\n");
                } else {
                    oddWriter.write(num + "\n");
                }

                line = in.readLine();
            }

            System.out.println("Even and odd numbers copied successfully!");

            // Close files
            evenWriter.close();
            oddWriter.close();
            in.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}