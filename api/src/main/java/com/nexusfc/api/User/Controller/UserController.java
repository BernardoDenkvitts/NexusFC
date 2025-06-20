package com.nexusfc.api.User.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nexusfc.api.Model.UserTeam;
import com.nexusfc.api.User.Dto.UserResponseDTO;
import com.nexusfc.api.User.Service.UserService;
import com.nexusfc.api.User.Service.UserTeamService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserTeamService userTeamService;

    public UserController(UserService userService, UserTeamService userTeamService) {
        this.userService = userService;
        this.userTeamService = userTeamService;
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUserData(@PathVariable String id) {
        return UserResponseDTO.fromUserModel(userService.find(id));
    }

    @GetMapping("/{id}/team")
    public UserTeam getUserTeam(@PathVariable String id) {
        return userTeamService.find(id);
    }

    @PatchMapping("/{id}/team")
    public UserTeam updateTeamName(@PathVariable String id, @RequestParam String newTeamName) {
        return userTeamService.updateTeamName(id, newTeamName);
    }

    @PatchMapping("/{id}/team/starter")
    public UserTeam updateStarter(@PathVariable String id, @RequestParam String playerId) {
        return userTeamService.changeStarterPlayer(id, playerId);
    }
    
}
