public class LogicalOperators {
    public static void main(String[] args) {

        int temperature = 33;
        boolean isWarm = temperature > 30 && temperature < 40;
        System.out.println(isWarm);

        String weather = "Cloudy";
        boolean willRain = weather.equals("Cloudy") || weather.equals("Windy");
        System.out.println(willRain);

        boolean isCriminal = true;
        boolean allowedToTravel = !isCriminal;
        System.out.println(allowedToTravel);

    }
}