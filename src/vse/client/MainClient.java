package vse.client;

class MainClient {
    public static void main(String[] args) {
        new Client("localhost", 8290).run();
    }
}
