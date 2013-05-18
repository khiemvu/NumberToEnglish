package English;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 5/14/13
 * Time: 6:03 AM
 * To change this template use File | Settings | File Templates.
 */
import java.lang.*;


public class English {

    public static String NumberToEnglish(int number) {
        String[] small = {"one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety"};
        String[] big = {"thousand", "million", "billion", "trillion"};

        long num = 0;
        String outPut = "";
        int unit = 0;
        long temp = 0;

        if (number == 0) {
            return "zero";
        }

        num = Math.abs(number);

        for (;;) {
            temp = num % 100;
            if (temp >= 1 && temp <= 19) {
                outPut = small[(int) temp - 1] + " " + outPut;
            } else if (temp >= 20 && temp <= 99) {
                if (temp % 10 == 0) {
                    outPut = tens[(int) (temp / 10) - 2] + " " + outPut;
                } else {
                    outPut = tens[(int) (temp / 10) - 2] + "-"
                            + small[(int) (temp % 10) - 1] + " " + outPut;
                }
            }

            temp = (num % 1000) / 100;
            if (temp != 0) {
                outPut = small[(int) temp - 1] + " hundred " + outPut;
            }

            num /= 1000;
            if (num == 0) {
                break;
            }

            temp = num % 1000;
            if (temp != 0) {
                outPut = big[unit] + " " + outPut;
            }
            unit++;
        }

        if (number < 0) {
            outPut = "negative " + outPut;
        }

        return outPut.trim();
    }


}