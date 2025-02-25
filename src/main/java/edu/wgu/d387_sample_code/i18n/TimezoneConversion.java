package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimezoneConversion {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static String convertTimeToAllZones() {
        String currentTime = "2025-02-24T12:00:00Z";
        ZonedDateTime currentZonedDateTime = ZonedDateTime.parse(currentTime);

        ZoneId zoneET =  ZoneId.of("America/New_York");
        ZoneId zoneMT = ZoneId.of("America/Denver");
        ZoneId zoneUTC = ZoneId.of("UTC");

        ZonedDateTime timeET = currentZonedDateTime.withZoneSameInstant(zoneET);
        ZonedDateTime timeMT = currentZonedDateTime.withZoneSameInstant(zoneMT);
        ZonedDateTime timeUTC = currentZonedDateTime.withZoneSameInstant(zoneUTC);

        String timeStringET = timeET.format(formatter);
        String timeStringMT = timeMT.format(formatter);
        String timeStringUTC = timeUTC.format(formatter);

        return timeStringET + " ET, " +  timeStringMT + " MT, " + timeStringUTC + " UTC";
    }
}
