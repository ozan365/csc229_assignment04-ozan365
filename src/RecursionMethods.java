public class RecursionMethods {
    public static void countDown(int num)

    {

        if (num == 0) // test

            System.out.println("Blastoff!");

        else {
            //Added if statement to only print text on even numbered recursive calls
            if(num % 2 == 0)
                System.out.println("...");

            countDown(num-1); // recursive call

        }

    }

    public static int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else

            return gcd(y, x % y);

    }

    //subtractive algorithm for gcd
    public static int subtractiveGCD(int x, int y) {
        //if both are the same return the number
        if (x == y)
            return x;
        //return subtract smaller from the bigger and use the two smaller numbers
        else if (x > y)
            return gcd(y, x - y);
        else
            return gcd(x, y - x);
    }

    public static int fib(int n)

    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }

    public static void helloWorldRepeat(int num) {
        //Base case accounting for negative numbers from input error
        if (num <= 0)
            return;
        //print Hello World and call method decrementing num
        else {
            System.out.println("Hello World!");
            helloWorldRepeat(num - 1);
        }
    }

    public static int sumOfSevens(int n1, int n2) {
        if (Math.abs(n2 - n1) < 7)
            //return the multiple between n1 and n2 if difference between the two is less than 7
            return (n1 / 7) * 7;
        if (n1 > n2)
            //return the first multiple less than or equal to n1 and recursively call the method subtracting the greater range value by 1
            return (n1 / 7) * 7 + sumOfSevens(n1 - 7, n2);
        if (n1 < n2)
            //same as last statement but with n2 if it is greater
            return (n2 / 7) * 7 + sumOfSevens(n1, n2 - 7);

        //error
        return 0;
    }

    //binary search method returns index of element or -1 if not found
    public static int binarySearch(int[] arr, int key, int high, int low) {

        //if statement prevents method from being called infinitely when high is less than low
        if (high >= low) {
            //middle index
            int index = (high - low) / 2 + low;

            //check if value at index is equal to key
            if (arr[index] == key)
                return index;

            //key is greater than middle index
            if (key > arr[index])
                //recursively call with low as middle index + 1
                return binarySearch(arr, key, high, index + 1);

            //key is less than middle index
            if (key < arr[index])
                //recursively call with high as middle index - 1
                return binarySearch(arr, key, index - 1, low);


        }
        //not found
        return -1;
    }


}
