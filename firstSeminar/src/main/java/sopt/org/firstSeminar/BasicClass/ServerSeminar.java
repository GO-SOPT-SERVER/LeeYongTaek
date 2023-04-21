package sopt.org.firstSeminar.BasicClass;
public class ServerSeminar implements Seminar {
    @Override
    public void startSeminar() {
        System.out.println("seminar starts at 14:10");
    }

    @Override
    public void endSeminar() {
        System.out.println("seminar ends at 17:20");
    }
}
