package service.abstracts.user;


public interface IUserService {
    void login();
    void register();
    void logout(String username);
}
