public class ans {
    public static int mystery(int[] inputArray, int k){
        /* Print The index of the smallest number after the index of k in the inputArray */
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length){
            if (inputArray[index] < x){
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }
    public static void mystery2(int[] inputArray){
        /* Exchange the value of index and the value of the smallest number after the index in the inputArray */
        int index = 0;
        while (index < inputArray.length){
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }
    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
           return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static int fib2(int n){
        int first = 0, second = 1;
        while (n != 0){
            int temp = first +second;
            first = second;
            second = temp;
            n -= 1;
        }
        return first;
    }
    public static void main(String[] args){
//        int size = 27;
//        String name = "Fido";
//        Dog myDog = new Dog(name, size);
//        int x = size - 5;
//        if (x < 15) {
//            myDog.bark(8);
//        }
//        while (x > 3) {
//            x -= 1;
//            myDog.play();
//        }
//        int[] numList = {2, 4, 6, 8};
//        System.out.print("Hello ");
//        System.out.println("Dog: " + name);
//        System.out.println(numList[1]);
//        if (numList[3] == 8) {
//            System.out.println("potato");
//        }

//        int[] inputArray = {3, 0, 4, 6, 3};
//        int k = 2;
//        System.out.println(mystery(inputArray, k));
//        mystery2(inputArray);
//        for (int j : inputArray) {
//            System.out.print(j + " ");
//        }

//        System.out.println(fib(5));
//        System.out.println(fib2(5));
    }
}
