package FinalExamSpring2022.Q2;

import java.io.*;

public class FileOddEven {
    public static void main(String[] args) throws IOException{
        File f = new File("src/FinalExamSpring2022/Q2/id.txt");
        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        PrintWriter printWriter1 = new PrintWriter(new File("src/FinalExamSpring2022/Q2/odd.txt"));
        PrintWriter printWriter2= new PrintWriter(new File("src/FinalExamSpring2022/Q2/even.txt"));

        String line;
        while((line = bufferedReader.readLine())!= null){
            int value = Integer.parseInt(line);
            if(value%2==0){
                printWriter2.println("0"+value);
            }else printWriter1.println("0"+value);
        }
        fileReader.close();
        bufferedReader.close();
        printWriter1.close();
        printWriter2.close();



    }
}
