package fileCopy;

import java.io.*;
public class fileCopy {
    public static void main(String[] args) {
        String file1 = "example.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Yangi fayl nomini krting-> ");
        String yangiFile = null;
        try {
            yangiFile = br.readLine();
        } catch (IOException e) {
            System.out.println("Xato-> " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(yangiFile))) {

            String nums;
            while ((nums = reader.readLine()) != null) {

                writer.write(nums);
                writer.newLine();
            }
            System.out.println("Fayl nusxalandi");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
