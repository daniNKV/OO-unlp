package unlp.ar.oo.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateLapse {
    LocalDate fromDate;
    LocalDate toDate;

    public DateLapse(LocalDate fromDate, LocalDate toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public LocalDate getFrom() {
        return this.fromDate;
    }

    public LocalDate getTo() {
        return this.toDate;
    }

    public int sizeInDays() {
        return (int) DAYS.between(fromDate, toDate);
    }

    public boolean includesDate(LocalDate other) {
        return fromDate.isBefore(other) && toDate.isAfter(other);
    }

    public boolean overlaps() {
        return true;
    }

}
