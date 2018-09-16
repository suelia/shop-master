package team.whatdev.shop.utils.constant;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("utils.random")
public class RandomProperties {

    private int count = 6;
    private boolean number = true;
    private String[] numbers = new String[]
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",};
    private String[] upChars = new String[]
            {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z"};
    private boolean upCase = true;
    private String[] lowChars = new String[]
            {"a", "b", "c", "d", "e", "f","g", "h", "i", "j", "k", "l", "m", "n", "o","p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private boolean lowCase = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public String[] getUpChars() {
        return upChars;
    }

    public void setUpChars(String[] upChars) {
        this.upChars = upChars;
    }

    public String[] getLowChars() {
        return lowChars;
    }

    public void setLowChars(String[] lowChars) {
        this.lowChars = lowChars;
    }

    public boolean isNumber() {
        return number;
    }

    public void setNumber(boolean number) {
        this.number = number;
    }

    public boolean isUpCase() {
        return upCase;
    }

    public void setUpCase(boolean upCase) {
        this.upCase = upCase;
    }

    public boolean isLowCase() {
        return lowCase;
    }

    public void setLowCase(boolean lowCase) {
        this.lowCase = lowCase;
    }
}
