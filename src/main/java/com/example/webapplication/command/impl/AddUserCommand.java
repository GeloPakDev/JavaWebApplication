package com.example.webapplication.command.impl;

import com.example.webapplication.command.Command;
import com.example.webapplication.command.Router;
import jakarta.servlet.http.HttpServletRequest;

public class AddUserCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) {
        return null;
    }
}
