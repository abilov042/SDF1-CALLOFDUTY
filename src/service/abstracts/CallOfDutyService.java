package service.abstracts;

import service.abstracts.user.IUserService;

// Template Design pattern istifade edilib
// ICallOfDutyService den implements olunub
// Abstract call dan istifade olunub ve child class lara extends olunub
public abstract class CallOfDutyService  implements ICallOfDutyService {

    // burada da capsullamaq istifade edilir obyekt construktor teresinden initialize olunur
    private final IUserService iUserService;

    public CallOfDutyService(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @Override
    public void loadGame(){
        // polimorfizm prinsibi rol oynayir

        iUserService.login();
        if(checkUpdate()) downloadUpdates();
        startGame();
    }
    @Override
    public void startGame() {
        System.out.println("Call of duty acilir");
    }
    @Override
    public void downloadUpdates() {
        System.out.println("Paketler yuklenir...");
    }
    @Override
    public boolean checkUpdate() {
        return true;
    }
}
