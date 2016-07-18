package ro.jtonic.handson.java8.time;

import java.time.*;
import java.time.temporal.*;
/**
 * Created by antonelpazargic on 18/07/16.
 */
public class TrainingForMyFirstMarathon {

    public static void main(String... args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2016, Month.OCTOBER, 8);

        System.out.println("ld1 = " + ld1);
        System.out.println("ld2 = " + ld2);

        final Period period = Period.between(ld1, ld2);
        System.out.println("period = " + period);
        final long days = ChronoUnit.DAYS.between(ld1, ld2);
        final long weeks = ChronoUnit.WEEKS.between(ld1, ld2);
        final long trainingWeeks = weeks - 1;

        System.out.format("There are %d days until my first marathon.\n", days);
        System.out.format("There are %d weeks until my first marathon.\n", weeks);
        System.out.format("There are %d training weeks until my first marathon.\n", trainingWeeks);

        final int pacePerWeek  = 1; // 1km
        final int currentMileage = 25; // km

        final int finalMileage = currentMileage + (int) trainingWeeks * pacePerWeek;

        System.out.printf("Final mileage before the marathon: %d", finalMileage);

        // Duration duration = Duration.between(ld1, ld2);
        // System.out.println("duration = " + duration);
    }

}
