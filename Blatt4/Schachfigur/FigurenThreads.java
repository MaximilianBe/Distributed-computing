package Schachfigur;

public class FigurenThreads {

    public static void main(String[] args) {

        Position figur = new Position();
        Leser leser = new Leser(figur);
        Schreiber schreiber = new Schreiber(figur);

        /*leser.setDaemon(true);
        schreiber.setDaemon(true);

        leser.start();
        schreiber.start();*/
        Thread t1 = new Thread(schreiber);
        t1.setDaemon(true);
        t1.start();
        Thread t2 = new Thread(leser);
        t2.setDaemon(true);
        MachMal.eineZehntelSekundeLangGarNichts();
        t2.start();

        try{
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
