public class Thread1 {

    public static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
    public static String[] numbers={"1","2","3","4","5","6","7","8","9"};


    public static void main(final String[] args) {
        for (int i = 0; i < letters.length; i++) {
        new Thread(getRunnable(i),letters[i]).start();
            try {
            Thread.sleep(200);
            } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            new Thread(getRunnable(i),numbers[i]).start();
                try {
                Thread.sleep(200);
                } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
                }
            }
    }

    public static Runnable getRunnable(int i) {
        return () -> {
            switch (i) {
            case 0:
                numbersUp();
                break;
            case 1:
                numbersDown();
                break;
            case 2:
                lettersForward();
                break;
            case 3:
                lettersBackward();
                break;
            default:
                break;
            }
            {
                System.out.println(Thread.currentThread().getName());
            } 
        };
    }         

    private static void numbersUp() {
        try {
            for (int j = 0; j <=8; j++) {
                System.out.println(numbers[j]);
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {
        }
    }

    private static void numbersDown() {
        try{
            for (int j = 8; j >= 0; j--) {
                System.out.println(numbers[j]);
                Thread.sleep(50);
            }
        }catch (final InterruptedException e) {
        }
        
    }
    private static void lettersForward() {
        try {
            for (int j = 0; j <=10; j++) {
                System.out.println(letters[j]);
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {
            
        }
    }

    private static void lettersBackward() {
        try {
            for (int j = 10; j >=  0; j--) {
                System.out.println(letters[j]);
                Thread.sleep(50);
            }
        }catch (final InterruptedException e) {
        
        }   
    }
}




