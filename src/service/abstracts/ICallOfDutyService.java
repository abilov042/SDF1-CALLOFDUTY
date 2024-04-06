package service.abstracts;

public interface ICallOfDutyService {
    void loadGame();
    void startGame();
    void downloadUpdates();
    boolean checkUpdate();
}
