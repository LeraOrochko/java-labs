public class Singer extends Actor {
    private int albums;

    public Singer(String name, int age, String genre, int albums) {
        super(name, age, genre);
        this.albums = albums;
    }

    @Override
    public String getAwards() {
        return "5 наград";
    }

    public void perform(String song, int times) {
        System.out.println(name + ": Поёт песню \"" + song + "\" " + times + " раз");
    }

    public int getAlbums() { return albums; }
}