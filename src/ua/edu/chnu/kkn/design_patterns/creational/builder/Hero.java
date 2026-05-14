package ua.edu.chnu.kkn.design_patterns.creational.builder;

public record Hero(
        Class heroClass,
        String name,
        HairType hairType,
        HairColor hairColor,
        Armor armor,
        Weapon weapon
) {

    private Hero(Builder builder) {
        this(builder.heroClass, builder.name, builder.hairType, builder.hairColor, builder.armor, builder.weapon);
    }

    public static class Builder {

        private final Class heroClass;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public Builder(Class heroClass, String name) {
            if (heroClass == null || name == null) {
                throw new IllegalArgumentException("Class and name can not be null");
            }
            this.heroClass = heroClass;
            this.name = name;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
