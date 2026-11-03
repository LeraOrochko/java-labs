public class Hotel {
    private String name;
    private int stars;
    private double pricePerNight;

    public Hotel(String name, int stars, double pricePerNight) {
        this.name = name;
        this.stars = stars;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return name + " (" + stars + " звёзд, " + pricePerNight + " руб./ночь)";
    }

    public static void main(String[] args) {
        Hotel[] hotels = {
                new Hotel("Гранд Отель", 5, 15000),
                new Hotel("Уют", 3, 4500),
                new Hotel("Морской бриз", 4, 8000),
                new Hotel("Центральный", 5, 12000),
                new Hotel("Эконом", 2, 2500),
                new Hotel("Люкс", 5, 20000)
        };

        Hotel maxStars = hotels[0];
        Hotel mostExpensive = hotels[0];

        for (Hotel h : hotels) {
            if (h.getStars() > maxStars.getStars()) {
                maxStars = h;
            }
            if (h.getPricePerNight() > mostExpensive.getPricePerNight()) {
                mostExpensive = h;
            }
        }

        System.out.println("Отель с максимальным количеством звёзд: " + maxStars);
        System.out.println("Самый дорогой отель: " + mostExpensive);
    }
}