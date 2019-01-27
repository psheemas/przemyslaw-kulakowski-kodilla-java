package com.kodilla;

public class FirstClass {

    private int minutes;
    private int hours;


    public FirstClass(int minutes, int hours) {
        setMinutes(minutes);
        setHours(hours);

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if(minutes >=0 && minutes <=59){
            this.minutes = minutes;
        } else {
            System.out.println("Invalid value");
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {

        if(hours >=1 && hours <=24){
            this.hours = hours;
        } else {
            System.out.println("Invalid value");
        }

    }

}
