package patrones.strategy.impl;

public interface IAuthStrategy {
    public Principal authenticate(String userName, String password);
}
