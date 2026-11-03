import java.util.*;

public class HotelService {
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Hotel findByName(String name) throws HotelNotFoundException {
        Iterator<Hotel> it = hotels.iterator();
        while (it.hasNext()) {
            Hotel h = it.next();
            if (h.getName().equalsIgnoreCase(name)) {
                return h;
            }
        }
        throw new HotelNotFoundException("Отель не найден: " + name, name);
    }

    public void printAll() {
        Iterator<Hotel> it = hotels.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getInfo());
        }
    }
}