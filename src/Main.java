

public class Main {
    public static String[] arr = {"(84)-(0978489648)", "(84)-(0978487648)"};
    public static String[] arr2 = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String e : arr) {
            System.out.println(phoneNumber.validate(e));
        }
        for (String e : arr2) {
            System.out.println(phoneNumber.validate(e));
        }
    }
}