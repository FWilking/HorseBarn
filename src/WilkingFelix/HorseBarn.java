package WilkingFelix;

public class HorseBarn {
    public Mustang[] horses;

    public HorseBarn(Mustang[] horses) {
        this.horses = horses;
    }
    public void consolidate(){
        int nearestempty = 0;
        for(int horseindex = 0; horseindex < horses.length; horseindex++) {
            if (horses[horseindex] == (null) && (nearestempty != horseindex - 1)) {
                nearestempty = horseindex;
            } else if (nearestempty != 0) {
                horses[nearestempty] = horses[horseindex];
                horses[horseindex] = null;
            }
        }
    }
}
