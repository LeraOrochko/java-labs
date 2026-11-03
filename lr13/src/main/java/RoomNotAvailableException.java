public class RoomNotAvailableException extends Exception {
    private int availableRooms;

    public RoomNotAvailableException(String message, int availableRooms) {
        super(message);
        this.availableRooms = availableRooms;
    }

    public int getAvailableRooms() { return availableRooms; }
}