package FirstDay;

public class HelloWorld {

    private static String personalizeMessage(String name, String lname) {
//		System.out.printf("Hello %s %s", name, lname);
        return "Hello %s" + name + " " + lname;
    }

    public static double meter(int inch) {
        return inch / 39.37;
    }

    public static String evenOrOdd(int input) {
        if (input % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static String isVowel(char c) {
        if (c == 'a' || c == 'e') {
            return c + " is a vowel";
        } else {
            return c + " is a consonant";
        }
    }

    public static double[] sumOfSeven() {
//		int sum = 0;
//		for(int i = 1; i < 101; i++) {
//			if(i % 7 == 0) {
//				sum =+ i;
//			}
//		}
//		
//		return sum;

        int counter = 0;
        int sum = 0;
        int count = 0;
        double[] arr = new double[2];

        while (counter <= 100) {
            if (counter % 7 == 0) {
                sum += counter;
                count++;
            }
            counter++;
        }

        arr[0] = sum;
        arr[1] = sum / count;
        return arr;
    }

    public static String grade(int input) {
        if (input >= 90 && input <= 100) {
            return "A";
        } else if (input >= 80 && input <= 90) {
            return "B";
        } else if (input >= 70 && input <= 80) {
            return "C";
        } else if (input >= 55 && input <= 70) {
            return "D";
        } else {
            return "f";
        }
    }

    public static String day(int time) {
        if (time >= 500 && time < 1190) {
            return "Good Morning";
        } else if (time >= 1190 && time <= 1600) {
            return "Good Afternoon";
        } else {
            return "Hey There";
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello, World!");

        System.out.println(meter(1000));

        System.out.println(personalizeMessage("Michael", "Gavrilchin"));

        System.out.println();
        System.out.println(grade(100));
        System.out.println(day(1900));

        int time = 17;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.println(evenOrOdd(2));

        System.out.println(isVowel('z'));

        System.out.println(sumOfSeven());

        double[] arr1 = sumOfSeven();
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 3; j++) {

            }
        }

    }

}