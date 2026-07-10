package authentication.system.controller;

import authentication.system.dto.RegisterRequest;
import authentication.system.dto.RegisterResponse;
import authentication.system.entity.AppUser;
import authentication.system.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UsersService userService;

    public UserController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<AppUser> getAllUsers() {
        return userService.getAllUsers();
    }

}