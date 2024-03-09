public class House extends StroyCompany{

    private ResidentialComplex residentialComplex;
    public House(String name, int yearOfFoundation, Town town, ResidentialComplex residentialComplex) {
        super(name, yearOfFoundation, town);
        this.residentialComplex = residentialComplex;
    }

    public final void building(){
        System.out.println("Дом строится");
    }

    public ResidentialComplex getResidentialComplex() {
        return residentialComplex;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nНазвание жилого комплекса: " + residentialComplex;
    }
}

