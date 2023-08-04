/*Разработайте программу, которая выбросит Exception, когда пользователь 
вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Four {

    public static void main(String[] args) {
        getVal();
        System.out.println();
    }

    static String getVal() {
    String val = "";
    System.out.println("Введите строку:");
    InputStream UserInput = System.in;
    Reader inputReader = new InputStreamReader(UserInput);
    BufferedReader bufferedReader = new BufferedReader(inputReader);
    try {
        val = bufferedReader.readLine(); 
        if(val.isBlank()){
            throw new IllegalArgumentException("Нельзя вводить пустую строку!");
        }
        }
    catch (IOException exception) {
        System.out.println("There are some IO problems.");
        //exception.printStackTrace();
        }
    return val;
    }
}