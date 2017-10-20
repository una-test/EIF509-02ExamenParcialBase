package ac.cr.una.parcial02.controller;

import ac.cr.una.parcial02.dto.UserDTO;
import ac.cr.una.parcial02.dto.UserLoginHistoryDTO;
import ac.cr.una.parcial02.model.Role;
import ac.cr.una.parcial02.model.User;
import ac.cr.una.parcial02.model.UserLoginHistory;
import ac.cr.una.parcial02.service.UserLoginHistoryService;
import ac.cr.una.parcial02.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest")
public class WebserviceController {

    @GetMapping("/users")
    public List<UserDTO> getUsers() {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }

    @GetMapping("/history")
    public List<UserLoginHistoryDTO> getUsersLoginHistory() {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }

    private UserLoginHistoryDTO convertUserLoginHistoryToDto(UserLoginHistory userLoginHistory) {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }

    private UserDTO convertUserToDto(User user) {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }
}
