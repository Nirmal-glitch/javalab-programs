import java.io.*;

class CreateFileAndWriteToConsole {
    public static void main(String[] args) {
        try {
            // Part 1: Writing to the file
            FileWriter fw = new FileWriter("abc.txt"); // create file
            fw.write("Once upon a time......"); // write to file
            fw.close();

            System.out.println("File written");

            // Part 2: Reading from the file
            FileReader fr = new FileReader("abc.txt");
            BufferedReader in = new BufferedReader(fr);

            String line = in.readLine();

            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

            in.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("There is some IOException");
        }
    }
}