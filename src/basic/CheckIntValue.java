package basic;

public class CheckIntValue {
    public static void main(String[] args) {
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;

        System.out.println("Max Value: "+myMaxValue);
        System.out.println("Min Value: "+myMinValue);

        System.out.println("Burst Min Value: "+(myMinValue-1));
        System.out.println("Burst Max Value: "+(myMaxValue+1));
    }
}
