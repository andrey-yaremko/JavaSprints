public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

    public int revers(int x){
        int rev_num = 0;
        while(x > 0) {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }
        return rev_num;
    }

    public int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int counter = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++counter;
        }
        if(sign==-1) counter=-counter;

        return counter;
    }
    public int mySqrt(int x) {
        int l = 1, r=x;
        while(r>l){
            int m = l+(r-l)/2;

            int div = x/m;
            if(m == div)
                return m;

            else if(m>div)
                r = m-1;
            else
                l = m+1;
        }

        if(l>(x/l))
            return l-1;
        return l;
    }
}
