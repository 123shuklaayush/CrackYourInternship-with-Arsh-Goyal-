package DSAsheetByArsh.String;

public class integerToRoman {
    public static String intToRoman(int num) {
        int[] numOfrom = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<numOfrom.length; i++){
            while(num>= numOfrom[i]){
                num -= numOfrom[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
}
