package com.hongyb.pattern.factory.method;

/**
 *  其实感觉这个示例已经是抽象工厂模式了。有点超出factory method
 */
public class App {
    private BlackSmith blackSmith ;

    public App(BlackSmith blackSmith) {
        this.blackSmith = blackSmith;
    }

    public static void main(String[] args) {
        App app = new App(new ElfBlackSmith());
        app.manufactureWeapons();

        app = new App(new OrcBlackSmith());
        app.manufactureWeapons();
    }
    public void manufactureWeapons(){
        Weapon weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);
        Weapon weapon1 = blackSmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon1);
    }
}
