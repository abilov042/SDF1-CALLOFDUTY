package service.concetes.user;

import entity.User;
import service.abstracts.user.IUserService;

import java.util.*;

public class UserService implements IUserService {

    private List<User> datas = new ArrayList<>();
    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Username i daxil edin");
        String username = scan.next();

        System.out.println("Password u daxil edin");
        String password = scan.next();

        User user = datas.stream()
                .filter(customer -> username.equals(customer.getUsername()))
                .findAny()
                .orElse(null);

        if(user == null){
            System.out.println("Melumatlar tapilmadi");
            register();
        }else if(password.equals(user.getPassword())){
            System.out.println("Login olundu");
        }else {
            System.out.println("Password yansilsdir ");
        }

    }
    @Override
    public void register() {
        User user = new User();

        System.out.println("Register olmaq");

        Scanner scan = new Scanner(System.in);

        System.out.println("Username i daxil edin");
        user.setUsername(scan.next());

        System.out.println("Email i daxil edin");
        user.setEmail(scan.next());

        System.out.println("password u daxil edin");
        user.setPassword(scan.next());

        System.out.println("password u tekrar daxil edin");
        String cPassword = scan.next();

        if (user.getPassword().equals(cPassword)){
            datas.add(user);
        }else {
            System.out.println("Password lar eyni deil yeniden yoxlayin");
            register();
        }
    }
    @Override
    public void logout(String username) {
        User user = datas.stream().filter(u -> u.getUsername().equals(username))
                .findAny()
                .orElse(null);

        datas.remove(user);
    }
}
