package com.kodilla;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        //SpringApplication.run(KodillaCourseApplication.class, args);

        FirstClass zegar = new FirstClass(20, 90);

        //zegar.minutes = 40;
        //zegar.setHours(40);


        System.out.println(SumNumbers.calculate(1,2));






    }

}

