package hu.nive.ujratervezes.zarovizsga.digitscounter;


public class DigitsCounter {

    public int getCountOfDigits(String numbers) {
        if (numbers == null) {
            return 0;
        }
        numbers = numbers.replaceAll("[a-z ]", "");
        return (int) numbers.chars().distinct().count();
    }
}
