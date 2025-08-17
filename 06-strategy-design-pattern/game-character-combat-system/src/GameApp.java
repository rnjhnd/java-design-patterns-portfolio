public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new KnightAttack(), new KnightDefense());
        
        System.out.println("Knight:");
        knight.attack();
        knight.defend();
        System.out.println();

        Character wizard = new Character(new WizardAttack(), new WizardDefense());
        
        System.out.println("Wizard:");
        wizard.attack();
        wizard.defend();
        System.out.println();

        Character archer = new Character(new ArcherAttack(), new ArcherDefense());

        System.out.println("Archer:");
        archer.attack();
        archer.defend();
        System.out.println();
    }
}
