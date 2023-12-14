package pl.coderslab.charity;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean authenticate(String username, String password) {
        return true;
    }
    // Your user authentication logic
}
