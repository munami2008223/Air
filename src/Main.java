public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15325; // стоимость билета

        int moneyForBonus = 20; // количество рублей за одну бонусную милю

        int bonus = ticketPrice / moneyForBonus;

        System.out.println(bonus + " бонусных миль");
    }
}