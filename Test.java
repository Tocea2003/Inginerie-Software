import Interfete.Exe;

public class Test implements Exe {
    void mostenire(){
        System.out.println("Acesta este un mesaj din clasa Test");
    }
    @Override
    public void Executa() {
        System.out.println("Acesta este un mesaj din interfata Exe");
    }
}
