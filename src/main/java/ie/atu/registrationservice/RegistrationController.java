package ie.atu.registrationservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "confirmation-service", url = "http://localhost:8081")
public class RegistrationController {
    @PostMapping
    public String registerUser(@RequestBody UserDetails userDetails) {
        // Implement the registration logic here, and return a confirmation message
        return "User registered: " + userDetails.getName();
    }

}
