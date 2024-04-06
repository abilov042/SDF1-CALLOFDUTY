package service.concetes;

import service.abstracts.CallOfDutyService;
import service.abstracts.user.IUserService;

public class WarZone extends CallOfDutyService {
    public WarZone(IUserService iUserService) {
        super(iUserService);
    }

    @Override
    public void startGame() {
        System.out.println("Call of Duty war zone acilir");
    }

    @Override
    public void downloadUpdates() {
        System.out.println("Paltarlar yuklnir");
    }

    @Override
    public boolean checkUpdate() {
        return false;
    }
}
