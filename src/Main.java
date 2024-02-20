public class Main {
    public static void main(String[] args) {
        RecursionMethods.countDown(10);


        //test for all integer pairs between 1 and 50 between both gcd methods
        for (int i = 1; i < 50; i++) {
            for(int j = 1; j < 50; j++) {
                if (RecursionMethods.gcd(i, j) != RecursionMethods.subtractiveGCD(i, j))
                    System.out.println("FIX ME");
            }
        }

        //test for 5 hello worlds
        RecursionMethods.helloWorldRepeat(5);

        //test between 1 and 1000
        System.out.println(RecursionMethods.sumOfSevens(1,1000));

        //test array
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //test all numbers in array including two out of bounds: -1 and 11
        for (int i = -1; i < 11; i++) {
            System.out.println(RecursionMethods.binarySearch(arr, i, arr.length - 1, 0));
        }

    }
}