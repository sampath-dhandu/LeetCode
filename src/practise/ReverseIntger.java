package practise;

public class ReverseIntger {

    public static void main(String[] args) {
        int input = 123;
        int output = 0;
        while (input > 0) {
            //int  reverse=;
            output = output * 10 + input % 10;
            input = input / 10;
        }
        System.out.println(output);

        System.out.println(isPolindrome(0));
    }

    private static boolean isPolindrome(int number) {
        int temp = 0;
        int input=number;
        while (number > 0) {
            temp = temp * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(temp);
        if (input == temp)
            return true;
        else
            return false;
    }
}
