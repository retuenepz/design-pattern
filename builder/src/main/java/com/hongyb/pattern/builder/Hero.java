package com.hongyb.pattern.builder;

/**
 * 作者:hongyanbo
 * 时间:2018/2/12
 * 构造方法私有化，利用static内部类Builder来构建Hero
 */
public class Hero {
    private final Armor armor;
    private final HairColor hairColor;
    private final HairType hairType;
    private final Profession profession;
    private final Weapon weapon;
    private final String name;

    /**
     * 利用builder 初始化Hero
     * @param builder
     */
    private Hero(Builder builder) {
        this.armor = builder.armor;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
        this.name = builder.name;
    }

    public Armor getArmor() {
        return armor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public HairType getHairType() {
        return hairType;
    }

    public Profession getProfession() {
        return profession;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public static  class Builder{
        private  Armor armor;
        private  HairColor hairColor;
        private  HairType hairType;
        private final Profession profession;
        private  Weapon weapon;
        private final String name;

        public Builder(Profession profession, String name) {
            if(profession == null || name == null ){
                throw  new IllegalArgumentException("角色名字和职业必须填");
            }
            this.profession = profession;
            this.name = name;
        }
        public Builder withArmor(Armor armor){
            this.armor = armor;
            return this;
        }
        public Builder withHairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }
        public Builder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }
        public Builder withWeapon(Weapon weapon){
            this.weapon = weapon;
            return this ;
        }

        /**
         * 构建最终方法
         * @return
         */
        public Hero build(){
            return new Hero(this);
        }
    }
}
