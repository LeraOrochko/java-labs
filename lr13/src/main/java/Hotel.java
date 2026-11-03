public class Hotel {
    private String name;
    private String city;
    private int stars;
    private int rooms;
    private int availableRooms;

    public Hotel(String name, String city, int stars, int rooms)
            throws InvalidHotelDataException {
        setName(name);
        setCity(city);
        setStars(stars);
        setRooms(rooms);
        this.availableRooms = rooms;
    }

    public void bookRoom() throws RoomNotAvailableException {
        if (availableRooms <= 0) {
            throw new RoomNotAvailableException("Нет свободных комнат в отеле " + name, availableRooms);
        }
        availableRooms--;
        System.out.println("Забронирована комната в отеле " + name + ". Свободно: " + availableRooms);
    }

    public void bookRoom(int count) throws RoomNotAvailableException {
        if (count <= 0) {
            throw new IllegalArgumentException("Количество комнат должно быть > 0");
        }
        if (availableRooms < count) {
            throw new RoomNotAvailableException(
                    "Недостаточно комнат в отеле " + name, availableRooms);
        }
        availableRooms -= count;
        System.out.println("Забронировано " + count + " комнат в отеле " + name + ". Свободно: " + availableRooms);
    }

    public void checkOut() {
        if (availableRooms < rooms) {
            availableRooms++;
            System.out.println("Освобождена комната в отеле " + name + ". Свободно: " + availableRooms);
        } else {
            System.out.println("В отеле " + name + " нет занятых комнат");
        }
    }

    public void checkOut(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Количество комнат должно быть > 0");
        }
        if (availableRooms + count > rooms) {
            availableRooms = rooms;
        } else {
            availableRooms += count;
        }
        System.out.println("Освобождено " + count + " комнат в отеле " + name + ". Свободно: " + availableRooms);
    }

    public String getInfo() {
        return "Отель " + name + " (" + city + "), звёзд: " + stars + ", комнат: " + rooms + ", свободно: " + availableRooms;
    }

    public String getName() { return name; }

    public void setName(String name) throws InvalidHotelDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidHotelDataException("Название отеля не может быть пустым");
        }
        this.name = name;
    }

    public String getCity() { return city; }

    public void setCity(String city) throws InvalidHotelDataException {
        if (city == null || city.isEmpty()) {
            throw new InvalidHotelDataException("Город не может быть пустым");
        }
        this.city = city;
    }

    public int getStars() { return stars; }

    public void setStars(int stars) throws InvalidHotelDataException {
        if (stars < 1 || stars > 5) {
            throw new InvalidHotelDataException("Звёзды должны быть от 1 до 5");
        }
        this.stars = stars;
    }

    public int getRooms() { return rooms; }

    public void setRooms(int rooms) throws InvalidHotelDataException {
        if (rooms <= 0) {
            throw new InvalidHotelDataException("Количество комнат должно быть > 0");
        }
        this.rooms = rooms;
        if (availableRooms > rooms) {
            availableRooms = rooms;
        }
    }

    public int getAvailableRooms() { return availableRooms; }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }
}