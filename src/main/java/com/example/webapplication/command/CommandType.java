package com.example.webapplication.command;

import com.example.webapplication.command.impl.AddUserCommand;
import com.example.webapplication.command.impl.DefaultCommand;
import com.example.webapplication.command.impl.LoginCommand;
import com.example.webapplication.command.impl.LogoutCommand;

import java.util.Locale;

public enum CommandType {
    ADD_USER(new AddUserCommand()),
    LOGIN(new LoginCommand()),
    LOGOUT(new LogoutCommand()),
    DEFAULT(new DefaultCommand());
    Command command;

    CommandType(Command command) {
        this.command = command;
    }


    public static Command define(String commandStr) {
        CommandType current = CommandType.valueOf(commandStr.toUpperCase());
        return current.command;
    }
}