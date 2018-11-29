package WilkingFelix;

public class HorseBarn {
    public Mustang[] horses;

    public HorseBarn(Mustang[] horses) {
        this.horses = horses;
    }
    public void consolidate(){
        int nearestempty = 0;
        Mustang[] consolidated = new Mustang[horses.length];
        int consolidatedindex = 0;
        for(int horseindex = 0; horseindex < horses.length; horseindex++) {
            if (horses[horseindex] != (null)) {
                consolidated[consolidatedindex] = horses[horseindex];
                consolidatedindex++;
            } else if (nearestempty != 0) {
                horses[nearestempty] = horses[horseindex];
                horses[horseindex] = null;
            }
        }
    }
    public void printbarn(){
        System.out.println();
        for(int horseindex = 0; horseindex < horses.length; horseindex++){
            if(horses[horseindex] != null) System.out.print(horses[horseindex].getName() + ", ");
            else{
                System.out.print("null, ");
            }
        }
    }
}
