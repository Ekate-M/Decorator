public class Program {
    public static void main(String[] args)  {
        SuperHero superHero = new SuperHeroAgility (new SuperHeroIntelligence (new EarthSuperHero()));
        superHero.superPower();
        System.out.println (superHero.superPower());
    }
}