public class A extends Napoje{
    private String nazwa;
    public A(String nazwa) {
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
        System.out.println("A");
    }
}
