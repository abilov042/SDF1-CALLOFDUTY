import entity.User;
import service.abstracts.ICallOfDutyService;
import service.abstracts.user.IUserService;
import service.concetes.Mobile;
import service.concetes.user.UserService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Call of Duty");

        IUserService iUserService = new UserService();
        ICallOfDutyService iCallOfDutyService = new Mobile(iUserService);

        iCallOfDutyService.loadGame();
    }
}
