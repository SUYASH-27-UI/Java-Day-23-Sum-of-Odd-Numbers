public class Main
{
    public static void main(String[] args)
    {
        int number = 1;
        int sum = 0;

        while (number <= 20)
        {
            sum = sum + number;
            number = number + 2;
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
