//create an Interface which contain abstract parameterized method
@FunctionalInterface
interface ReverseString {
    abstract void reverse(String name);
}

public class Main {
    public static void main(String[] args) {
        //declare reference of ReverseString Interface, but we can not instantiate an interface
        ReverseString r;
        //use of the lambda expression.
        r = (name) ->
        {
            int size = name.length();
            for (int i = 0; i < size; i++) {
                System.out.print(name.charAt(name.length() - i - 1));
            }
        };
        //calling the method
        r.reverse("programming");
    }
}
