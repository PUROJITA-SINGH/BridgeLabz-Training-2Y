import java.util.function.Consumer;

public class SmartLightLambda {
    public static void main(String[] args) {
        Consumer<String> lightAction;

        lightAction = trigger -> {
            switch (trigger) {
                case "MOTION" -> System.out.println("Lights ON: Motion detected!");
                case "TIME" -> System.out.println("Lights dimmed for evening mode.");
                case "VOICE" -> System.out.println("Lights toggled by voice command.");
                default -> System.out.println("No action for this trigger.");
            }
        };

        lightAction.accept("MOTION");
        lightAction.accept("TIME");
        lightAction.accept("VOICE");
    }
}
