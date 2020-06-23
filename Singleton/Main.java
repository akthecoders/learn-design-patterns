package Singleton;

/**
 * Main
 */
public class Main {

    public static void main(String [] args) {
        System.out.println(" Inst : " + Singleton.getInstances());
        Singleton inst1 = Singleton.instance();
        System.out.println(" Inst : " + Singleton.getInstances());
        Singleton inst2 = Singleton.instance();
        System.out.println(" Inst : " + Singleton.getInstances());
        Singleton inst3 = Singleton.instance();
        System.out.println(" Inst : " + Singleton.getInstances());

    }
}


class Singleton {
    private static Singleton single = null;
    private static int noOfInstances = 0;
    private Singleton() {

    }
    
    public static int getInstances() {
        return noOfInstances;
    }
    public static Singleton instance() {
        if(single == null) {
           single = new Singleton();
           noOfInstances++;
        }
        return single;
    }
}