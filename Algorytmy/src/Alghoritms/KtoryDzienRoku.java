package Alghoritms;

import java.time.*;
import java.util.Date;

/**
 * Created by RENT on 2017-07-28.
 */
public class KtoryDzienRoku extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Ktory to dzien roku";
    }

    @Override
    public void runAlgorithm(String[] input)  {

        int day;
        int month;
        int year;

        for (int i = 1; i <input.length ; i=i+3) {
            day=Integer.parseInt(input[i]);
            month=Integer.parseInt(input[i+1]);
            year=Integer.parseInt(input[i+2]);

            try {
                runSimpleTest(day,month,year);
            } catch (DateTimeException e){
                System.out.println(day+"-"+month+"-"+year+" => Nie można utworzyć takiej daty");
            }
        }


    }

    private void runSimpleTest(int day,int month, int year) throws DateTimeException {
        LocalDate date = LocalDate.of(year-1,12,31);
        LocalDateTime dateTime2=LocalDateTime.of(date,LocalTime.NOON);

        LocalDate data = LocalDate.of(year, month, day);
        LocalDateTime dataTime= LocalDateTime.of(data,LocalTime.NOON);

        Duration days = Duration.between(dataTime, dateTime2);
        System.out.println(data+" => "+days.toDays());
    }
}


