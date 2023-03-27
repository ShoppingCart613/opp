public class Coke extends Napoje{
    private String nazwa;
    public Coke(String nazwa) {
        super(nazwa);
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return getNazwa();
    }

    @Override
    public void pij(){
        System.out.println("koka kola espuma");
    }
}
