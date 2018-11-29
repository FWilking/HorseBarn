package WilkingFelix;

public class Main {

    public static void main(String[] args) {
        Mustang horse1 = new Mustang("Secretariat", 12000);
        Mustang horse2 = new Mustang("Dusty Trail", 22000);
        Mustang horse3 = new Mustang("Silver", 12000);

        Mustang[] horses = new Mustang[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn.horses);

        barn.consolidate();
        System.out.println(barn.horses);
    }
}
