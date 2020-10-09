

public class Main {
    public static void main(String[] args) {
        Builder.Computer.ComputerBuilder builder = new Builder.Computer.ComputerBuilder("1 TB", "16 GB");
        Builder.Computer computer = builder.setGraphicCard("820 M")
                .setSpeaker("Bose")
                .build();

    }
}

