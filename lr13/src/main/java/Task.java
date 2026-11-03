public class Task {
    public static void main(String[] args) {
        HotelService service = new HotelService();

        try {
            service.addHotel(new Hotel("Grand", "Minsk", 5, 10));
            service.addHotel(new Hotel("Cosmos", "Minsk", 4, 5));
            service.addHotel(new Hotel("Belarus", "Minsk", 3, 2));
        }
        catch (InvalidHotelDataException e) {
            System.out.println("Ошибка создания отеля: " + e.getMessage());
        }

        try {
            Hotel bad = new Hotel("Bad", "Minsk", 10, 0);
            service.addHotel(bad);
        }
        catch (InvalidHotelDataException e) {
            System.out.println("Ожидаемая ошибка: " + e.getMessage());
        }

        System.out.println("\n Список отелей ");
        service.printAll();

        System.out.println("\n Бронирование ");
        try {
            Hotel grand = service.findByName("Grand");
            grand.bookRoom();
            grand.bookRoom(3);
        } catch (HotelNotFoundException e) {
            System.out.println("Не найден: " + e.getHotelName());
        }
        catch (RoomNotAvailableException e) {
            System.out.println("Нет комнат: " + e.getMessage() +
                    " (свободно " + e.getAvailableRooms() + ")");
        }
        finally {
            System.out.println("Блок finally: бронирование завершено");
        }

        System.out.println("\n Перебор с комнатами ");
        try {
            Hotel belarus = service.findByName("Belarus");
            belarus.bookRoom(5);
        }]
        catch (HotelNotFoundException e) {
            System.out.println("Не найден: " + e.getHotelName());
        }
        catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage() +
                    " (свободно " + e.getAvailableRooms() + ")");
        }
        finally {
            System.out.println("Блок finally выполнен");
        }

        System.out.println("\n Поиск несуществующего отеля ");
        try {
            service.findByName("Hilton");
        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage() +
                    ", искомое имя: " + e.getHotelName());
        } finally {
            System.out.println("Блок finally выполнен");
        }

        System.out.println("\n Выселение ");
        try {
            Hotel grand = service.findByName("Grand");
            grand.checkOut();
            grand.checkOut(2);
        } catch (HotelNotFoundException e) {
            System.out.println("Не найден: " + e.getHotelName());
        } finally {
            System.out.println("Блок finally выполнен");
        }

        System.out.println("\n Итоговое состояние ");
        service.printAll();
    }
}