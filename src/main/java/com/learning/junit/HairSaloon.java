package com.learning.junit;

public class HairSaloon {
    private String[] openingDay ={"Monday","Tuesday"};

    public String[] getOpeningDay(){
        return openingDay;
    }

    public boolean isOpen(String weekDay) throws IllegalAccessException {
        if (!weekDay.endsWith("day")){
            throw new IllegalAccessException("The weekday argument must end in the letters 'day'");
        }
        if (weekDay.equalsIgnoreCase("Monday") || weekDay.equalsIgnoreCase("Tuesday") ){
            return true;
        }
        else return false;
    }
}
