package observer;

public class Client {
    public static void main(String[] args) {
        Observable cricketStream = new CricketScoreStream();
        Observer internet = new Internet(cricketStream);
        Observer television = new Television(cricketStream);

        cricketStream.register(internet);
        cricketStream.register(television);

        cricketStream.setScore(5);
        cricketStream.setScore(10);
        cricketStream.setScore(18);
    }
}
