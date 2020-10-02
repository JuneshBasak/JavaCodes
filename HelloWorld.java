public class HelloWorld {   // Class name to be same as the file name , else there will be an error.
    //Print Hello World & Hello Junesh!
    public static void main (String[] args){    //main method compulsory in class files

        System.out.println ("Hello World");

    //Print Hello Junesh!

        System.out.println("Hello Junesh!");

        //Print an integer value

        int MyIntegerValue = 5;
        int MyIntegerValue2 = MyIntegerValue*3;
        int MyIntegerValue3 = MyIntegerValue2*2 ;

        int MyTotalValue = MyIntegerValue + MyIntegerValue2 + MyIntegerValue3;

        System.out.println(MyTotalValue);

        int MyLastOne =(1000 - MyTotalValue);
        System.out.println(MyLastOne);


    }

}
