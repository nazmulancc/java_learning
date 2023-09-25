public class W1S2{


        public void testDataType () {

            int num;
            num = 2;

            String strValue = "\u0065";

            double numDouble = (double) num;

            System.out.println(strValue);
            System.out.println("Num + Double :"+(numDouble+num));
        }

        public  double sumDivideByTwo(int a, int b) {

        return ((a+b)/2);
        }
        public  double sumDivideByTwo(double a, double b) {

        return ((a+b)/2);
        }

        public  double multiplyTwoNumbers(int num1, int num2) {

        return (double) num1 * num2;
        }


    public static void main(String[] args) {

        int sum = (1+2+3+4+5)/2;
        System.out.println("Sum of numbers: "+sum);

        W1S2 object = new W1S2();
        object.testDataType();

        System.out.println("Calling the int parameter: "+object.sumDivideByTwo(4,5));
        System.out.println("Calling the double parameter: "+object.sumDivideByTwo(4.0,5));


        //object2.sumDivideByTwo(5,7);
    }

}
