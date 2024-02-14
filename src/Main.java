import controller.UserController;
import model.repository.GBRepository;
import model.repository.impl.UserRepository;
import view.UserView;

import static util.DBConnector.DB_PATH;
import static util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}