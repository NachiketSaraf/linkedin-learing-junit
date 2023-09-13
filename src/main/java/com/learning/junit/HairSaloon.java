package com.learning.junit;

import java.util.Arrays;

public class HairSaloon {

    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    private Day[] openingDay ={Day.MONDAY,Day.TUESDAY};
    private int haircutPrice = 300;
    private Calculator calculator =new Calculator();
    public Day[] getOpeningDay(){
        return openingDay;
    }

    public boolean isOpen(Day weekDay)  {
//        if (!weekDay.endsWith("day")){
//            throw new IllegalArgumentException("The weekday argument must end in the letters 'day'");
//        }
        if (Arrays.asList(openingDay).contains(weekDay)){
            return true;
        }
        else return false;
    }
    public int getHaircutPrice(){
        return haircutPrice;
    }

    public int applyDiscount() throws IllegalArgumentException {
        return calculator.divide(haircutPrice,2) + 50;
    }
}
