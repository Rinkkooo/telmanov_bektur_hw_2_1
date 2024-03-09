public final class Apartment extends House {

    private int rooms;
    public Apartment(String name, int yearOfFoundation, Town town, ResidentialComplex residentialComplex, int rooms) {
        super(name, yearOfFoundation, town, residentialComplex);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nКоличество комнат: " + rooms;
    }

}
