package com.emmanuelanene.BackSense.services;

import com.emmanuelanene.BackSense.dtos.LoginRequest;
import com.emmanuelanene.BackSense.dtos.RegisterRequest;
import com.emmanuelanene.BackSense.dtos.Response;
import com.emmanuelanene.BackSense.dtos.UserDTO;
import com.emmanuelanene.BackSense.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
