package com.hgalarze.portfolio.Interface;

public interface IAuthService {

    public void register(String username, String password);

    public void login(String username, String password);

    public void logout();
}
