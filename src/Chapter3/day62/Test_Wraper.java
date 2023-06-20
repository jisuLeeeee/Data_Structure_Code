package Chapter3.day62;

public class Test_Wraper {

    public static void main(String[] args) {
        Object[] array = new Object[100];
        int a = 20;
        Integer age = new Integer(a); // wrapping

         array[0] = age;

        int b = age.intValue(); // unwrapping
        System.out.println(b);

        String str = "1234";
        int c = Integer.parseInt(str);
        System.out.println(c);
    }
}