
public class Main {
    public static void main(String[] args) {

        System.out.println(getRandom() + space() + getRandom() + space() + getRandom() + space() + getRandom());
    }

    public static int getRandom () {
        return (int) (Math.random() * 10);
    }

    public static String space () {
        return "   ";
    }
}