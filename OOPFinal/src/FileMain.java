import java.io.*;

public class FileMain {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader read = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter write = new BufferedWriter(new FileWriter("src/output.txt", true));

            String line; int sum=0, count=0, lcount = 0;
            while((line = read.readLine()) != null){
                count++;
                sum += Integer.parseInt(line);
                if(count%2 == 0){
                    lcount++;
                    write.write("Line "+ lcount+": " + sum);
                    write.write("\n");
                    sum = 0;
                }
            }
            read.close();
            write.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}