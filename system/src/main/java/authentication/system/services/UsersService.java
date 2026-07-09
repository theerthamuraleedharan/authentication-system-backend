package authentication.system.services;

import authentication.system.entity.AppUser;
import authentication.system.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final AppUserRepository userRepository;

    public UsersService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getAllUsers() {
        return userRepository.findAll();
    }
}