//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
task();
task1();
task2();
task3();
        for (int i = 1; i <= 55; i+=2) {
            System.out.println("i = " + i);
        }
    }
    public static void task() {
       for (int g = 2; g < 21; g++) {
           System.out.println("g = " + g);
        }
    }
    public  static void task1() {
        int[] r = {5,2,90,3};
        System.out.println(  r[2] + " ");
    }
        public static void task2(){
        int [] h =  {5,-3,-2,16,55,0};
        int sum = 0;
        for ( int number  : h ) {
            if (number > 0) {
             sum += number;
            }
        }
        System.out.println( + sum);
        }
        public static void task3(){
        int [] numbers ={1,-3,4,-2};
        for (int Las : numbers) {
            System.out.println( numbers + "");
        }
        }
        public static void task4() {
        
        }
}