package devices.company;
public class Phone {
    String producer;
    String model;
    String System;

    @Override
    public String toString() {
            String x = "Model: " + this.model + ";" +
                    "Producent: " + this.producer + ";" +
                    "Cena: " + System + ";";
            return x;
        }
}