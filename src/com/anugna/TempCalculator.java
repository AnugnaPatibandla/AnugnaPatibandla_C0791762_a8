package com.anugna;

import javax.swing.*;
import java.util.ArrayList;

class FeelsLike{
    int windSpeed;
    int temperature;
    int feelsLikeTemp;
    String day;

    public FeelsLike(int windSpeed, int temperature, String day) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.day = day.toUpperCase();
        calcFeelLikeTemp();
    }
    public void calcFeelLikeTemp()
    {
        feelsLikeTemp = temperature * windSpeed;
    }

    @Override
    public String toString() {
        //to print Object
        StringBuilder str= new StringBuilder();
        str.append("Today is "+day);
        str.append("\nWind Speed : "+windSpeed+" mph");
        str.append("\nTemperature : "+temperature+" Celsius");
        str.append("\nFeels Like Temperature : "+feelsLikeTemp);
        return new String(str);
    }
}

public class TempCalculator {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to feels like temperature calculator");
        String inp = JOptionPane.showInputDialog("Enter the day, temperature and wind speed separated by comma");
        ArrayList<String> inpValues = new ArrayList<String>(); //using ArrayList
        for(String st: inp.split(",")) //inp.split(",") returns an array of Strings
            inpValues.add(st);
        String day = inpValues.get(0).toUpperCase();
        int temperature = Integer.parseInt(inpValues.get(1));
        int windSpeed = Integer.parseInt(inpValues.get(2));
        FeelsLike flt = new FeelsLike(windSpeed,temperature,day);
        JOptionPane.showMessageDialog(null,flt);
    }

}
