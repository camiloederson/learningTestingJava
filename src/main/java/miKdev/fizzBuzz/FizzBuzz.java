package miKdev.fizzBuzz;

import java.sql.ResultSet;

public class FizzBuzz {
    public String calculates(int i) {
        String result = "";
        if (i % 3 == 0) result += "Fizz";
        if (i % 5 == 0) result += "Buzz";
        return result.isEmpty() ? String.valueOf(i) : result;
    }
}
