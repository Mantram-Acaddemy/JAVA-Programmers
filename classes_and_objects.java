class Chicken {
    public void ingridients(Boolean water, String masala, int chicken, String sabzi) {
        System.out.println("Do we need water? " + water);
        System.out.println("We also need " + masala + ", " + chicken + "kg chicken, & " + sabzi + " sabziyaan");
    }
}

public class classes_and_objects {
    public static void main(String[] args) {
        Chicken butterChicken = new Chicken();
        butterChicken.ingridients(true, "Mirch, Haldi ,Namak, Chicken Masala", 2, "Pyaaz, Tamatar");

        Chicken kadaiChicken = new Chicken();
        kadaiChicken.ingridients(true, "Soya Sauce, Mirch, Cream, ", 3, "Shimla Mirch, Tamatar, Pyaar, Kaaju");
    }
}
