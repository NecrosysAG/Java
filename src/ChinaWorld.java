public class ChinaWorld {
    public static void main(String[] args) {

        //задача 1

        int peopleOfChina = 1_411_778_724;
        int worldCountries = 197;

        long planetEarthPopulation = (long) peopleOfChina * worldCountries;

        System.out.println(planetEarthPopulation);

        //задача 2

        long durabilityFelixLifeInSeconds = 3_011_456_567L;
        int secondsInOneMinute = 60;
        int minutesInOneHour = 60;
        int hoursInOneDay = 24;
        int daysInWholeYear = 365;
        int secondsInOneYear = daysInWholeYear * hoursInOneDay * minutesInOneHour * secondsInOneMinute;

        int durabilityFelixLifeInYears = Math.toIntExact(durabilityFelixLifeInSeconds / secondsInOneYear);

        System.out.println(durabilityFelixLifeInYears);









    }
}
