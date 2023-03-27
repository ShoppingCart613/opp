public class Herbata extends Napoje{
    private String nazwa;
    public Herbata(String nazwa) {
        super(nazwa);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void pij(){
        System.out.println("mmmmmmmmmmm");
    }
}
