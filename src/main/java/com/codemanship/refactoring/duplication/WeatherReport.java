package com.codemanship.refactoring.duplication;

import java.util.List;

class WeatherReport {

    void formatDailyReport(List<Forecast> forecasts, List<String> output) {

        for (Forecast forecast : forecasts) {

            if (forecast.isMorning()) {
                String line = formatForecast(forecast, "Morning: ");
                output.add(line);
            }

            if (forecast.isAfternoon()) {
                String line = formatForecast(forecast, "Afternoon: ");
                output.add(line);
            }

            if (forecast.isEvening()) {
                String line = formatForecast(forecast, "Evening: ");
                output.add(line);
            }

            if (forecast.isNight()) {
                String line = formatForecast(forecast, "Night: ");
                output.add(line);
            }
        }
    }

    private static String formatForecast(Forecast forecast, String timeOfDay) {
        String line = timeOfDay + forecast.getTemperature() + "°C, "
                + forecast.getCondition() + ", wind " + forecast.getWindSpeed() + "km/h";
        return line;
    }
}
