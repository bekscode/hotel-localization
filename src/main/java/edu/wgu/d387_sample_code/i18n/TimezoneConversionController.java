package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time")
@CrossOrigin(origins = "http://localhost:4200")
public class TimezoneConversionController {

    @GetMapping("/convert")
    public String convertTimezone() {
        return TimezoneConversion.convertTimeToAllZones();
    }
}
