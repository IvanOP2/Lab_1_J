package ua.edu.chnu.kkn.design_patterns.creational.abstract_factory;

public record Kingdom(King king, Castle castle, Army army) {

    public static class FactoryMaker {

        public static KingdomFactory makeFactory(KingdomType type) {
            return switch (type) {
                case ELF -> new ElfKingdomFactory();
                case ORC -> new OrcKingdomFactory();
            };
        }
    }
}
