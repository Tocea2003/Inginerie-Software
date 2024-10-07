import Interfete.Exe;
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Test subtest = new Subtest();
        test.Executa();
        test.mostenire();
        subtest.mostenire();
        test=new Subtest();
        Exe executabil = new Test();
        executabil.Executa();

    }
}
