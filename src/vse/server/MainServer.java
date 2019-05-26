package vse.server;

class MainServer {
    public static void main(String[] args) {

        try {
            new Server(8290).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}
