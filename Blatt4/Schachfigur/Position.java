package Schachfigur;

public class Position extends Figur{

    @Override
    public synchronized void setPosition(char x, int y) {
        this.x = x;
        MachMal.eineZehntelSekundeLangGarNichts();
        this.y = y;
    }

    @Override
    public synchronized String getPosition() {
        for(int i = 0; i <10; i++){
            MachMal.eineZehntelSekundeLangGarNichts();
        }
        //sleep(1000);
        return x + String.valueOf(y);
    }
}
