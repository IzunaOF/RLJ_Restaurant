package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Period;
import models.PeriodEnum;

public class PeriodController {

    private Integer ID_CONTROL = 0;
    private Map<PeriodEnum, Period> periods = new HashMap<>();

    public PeriodController() {
    }

    public Period getPeriod(PeriodEnum typeEnum) {
        return this.periods.get(typeEnum);
    }

    public void setPeriod(PeriodEnum type, String name, String startTime, String endTime) {
        Period period = new Period(++ID_CONTROL, name, startTime, endTime);
        this.periods.put(type, period);
    }
}

