package service.concetes;

import service.abstracts.CallOfDutyService;
import service.abstracts.user.IUserService;

public class Mobile extends CallOfDutyService {
    public Mobile(IUserService iUserService) {
        super(iUserService);
    }

    @Override
    public void startGame() {
        System.out.println("Call of Duty mobile acilir");
    }

    @Override
    public void downloadUpdates() {
        System.out.println("Silahlar endirilir");
    }

    @Override
    public boolean checkUpdate() {
        return true;
    }
}
