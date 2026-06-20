package com.codemanship.refactoring.duplication;

import java.util.List;

class WeatherReport {

    void formatDailyReport(List<Forecast> forecasts, List<String> output) {

        for (Forecast forecast : forecasts) {

            if (forecast.isMorning()) {
                String line = forecast.formatForecast(forecast);
                output.add(line);
            }

            if (forecast.isAfternoon()) {
                String line = forecast.formatForecast(forecast);
                output.add(line);
            }

            if (forecast.isEvening()) {
                String line = forecast.formatForecast(forecast);
                output.add(line);
            }

            if (forecast.isNight()) {
                String line = forecast.formatForecast(forecast);
                output.add(line);
            }
        }
    }

}
