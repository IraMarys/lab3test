import java.util.TreeMap;

public class IntegerToRomanConverter {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String toRoman(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }
        int floorKey = map.floorKey(number);
        if (number == floorKey) {
            return map.get(number);
        }
        return map.get(floorKey) + toRoman(number - floorKey);
    }

    public static void main(String[] args) {
        System.out.println("1987 in Roman: " + toRoman(1987));
    }
}
