/*
    .  - любой  символ  a.b  --> asb  aAb ....
    \.  --> .
    ^  - начало строки  ^hello --> hello my friend
    $  - конец строки   $end -->  this is the end
    \d -  0,1 ..9
    \D - кроме 0,1 ..9 --> A,b ....
    a-z   a,b,c,d ... z abcd...z
    A-Z   A,B .....
    \s    пробелы
    \w    A-Za-z0-9_
    \W    все остальные символы
    + 1 или более символов
    {3} {3,8} диапазон
 */

package start;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp
{
    public static void main(String[] args)
    {
        String str1 = "123a!brgty";
        String str2 = "a b treytyrn";
        String regExp = "a.b";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        System.out.println("-------------------");

        Pattern pattern1 = Pattern.compile("^a.b");
        Matcher matcher1 = pattern1.matcher(str2);
        System.out.println(matcher1.find());
        System.out.println("-------------------");

        System.out.println("isDigit --> " + isDigit("121"));
        System.out.println("-------------------");

        System.out.println("isPhoneNumber --> " +
                isPhoneNumber("+972-53-333-33-33"));
        System.out.println("isPhoneNumber --> " +
                isPhoneNumber("+97253-333-33-33"));
        System.out.println("-------------------");

        System.out.println("isEmail --> " +
                isEmail("my.mail@mail.aa"));
        System.out.println("isEmail --> " +
                isEmail("12!@#$%.qwrewr"));
        System.out.println("-------------------");

        System.out.println("isFullName --> " +
                isFullName("Kek Kekov"));
        System.out.println("isFullName --> " +
                isFullName("Kek kekov"));
        System.out.println("-------------------");
    }

    static boolean isDigit(String str)
    {
        Pattern pattern = Pattern.compile("\\d+");
        //Pattern pattern = Pattern.compile("\\d*");
        //Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static boolean isPhoneNumber(String str)
    {
        String regExp = "^\\+\\d{3}-\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static boolean isEmail(String str)
    {
        String regExp = "^\\w+\\.?\\w+@\\w+\\.[A-Za-z]{2,3}$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static boolean isFullName(String str)
    {
        String regExp = "^[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
