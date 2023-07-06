package DSAsheetByArsh.String;

public class validNumber {
    public boolean isNumber(String s) {
        boolean num = false;
        boolean exp = false;
        boolean dot = false;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                num = true;
            }
            else if(c == 'e' || c== 'E'){
                if(exp || !num) return false;
                else{
                    exp= true;
                    num = false;
                }
            }
            else if(c == '.'){
                if(dot || exp)
                    return false;
                dot = true;
            } else if( c == '-' || c == '+'){
                if( i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')
                    return false;
            }

            else return false;
        }
        return num;
    }
}
