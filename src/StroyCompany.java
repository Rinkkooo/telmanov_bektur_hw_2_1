public class StroyCompany {
    private String name;
    private int yearOfFoundation;

    private Town town;

    public StroyCompany(String name, int yearOfFoundation, Town town) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.town = town;
    }


    public String getInfo(){
        return "Город: " + town.getName() + "\nГод основания: " + yearOfFoundation + "\nНазвание: " + name;
    }

    public String getName() {
        return name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public Town getTown() {
        return town;
    }
}
