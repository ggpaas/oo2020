public class HelloWorld{

    byte minmyByte = Byte.MIN_VALUE;
    byte maxmyByte = Byte.MAX_VALUE;
    public static void main(String[] args){
        System.out.println("Hello world");

        byte minmyByte = Byte.MIN_VALUE;
        byte maxmyByte = Byte.MAX_VALUE;
        // short, int , long, float, double, char, boolean
        boolean flag = true;

        System.out.println(1+1); // * / - %
        // i++ on tegelikult i=i+1 
        int number = 5;
        System.out.println(number++);
        System.out.println(++number);

        if (number < 10 || number > 0){
            System.out.println("Jah");
        }
        for (int i = 0; i < 10; i++){

        }
        int counter = 0;

        while (flag){
            counter++;
            if (counter == 10){
                 System.out.println("I'm out");
                flag = false;
        }
            //teeb midagi
        }

        int counterTwo = 0;
        
        do {
            counterTwo++;
        }while(counterTwo == 10);

        int[] numberArray = new int [] {1, 2, 3, 4, 5};

        for(int element : numberArray ){
            System.out.println(element);
        }

        for(int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

        String myname = "Gevin";

        System.out.println(myname);

        HelloWorld helloworld = new HelloWorld();

        //helloWorld.printSomething();

        printSomething(10);

        String name =name();
        System.out.println(name);
    }

    static String name(){
        return "Gevin";
    }

    static void printSomething(int number){
        for(int i = 1; i < 10; i++){
            number += i;
        }
        System.out.println(number);
    }
}