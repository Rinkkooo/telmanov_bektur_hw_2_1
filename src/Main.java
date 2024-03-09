 public class Main {
    public static void main(String[] args) {
        StroyCompany stroyCompany = new StroyCompany("Elite House", 2013, new Town("Bishkek"));

        System.out.println(stroyCompany.getInfo());

        House house = new House("Elite House", 2013,  new Town("Osh"), ResidentialComplex.Karven);

        System.out.println(house.getInfo());
        house.building();

        Apartment apartment = new Apartment("Elite House", 2013, new Town("ALMATY"), ResidentialComplex.Karven, 3);
        System.out.println(apartment.getInfo());

        Apartment apartment1 = new Apartment("Avangard", 2011, new Town("Talas"), ResidentialComplex.EverGreen, 4);
        System.out.println(apartment1.getInfo());

    }
}