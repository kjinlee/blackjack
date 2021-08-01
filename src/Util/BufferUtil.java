package Util;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferUtil {
    public static String readLine(BufferedReader bf, String message) throws IOException {
        System.out.println(message);
        System.out.print("> ");

        String str = new String(bf.readLine());

        if (str.isEmpty()) {
            str = new String(bf.readLine());
        }

        return str;
    }

    
    public static int readInt(BufferedReader bf, String message) throws IOException {
        String temp = readLine(bf, message);
        
        while (!temp.matches("\\d+")) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("숫자만 입력하실 수 있습니다.");
            temp = readLine(bf, message);
        }


        return Integer.parseInt(temp);
    }

    public static int readInt(BufferedReader bf, String message, int min, int max) throws IOException {

        int number = readInt(bf, message);

        while (!(number >= min && number <= max)) {
            System.out.println("잘못입력하셨습니다.");
            number = readInt(bf, message);
        }

        return number;
    }

}