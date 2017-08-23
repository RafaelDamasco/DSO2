package ine;

import view.LoginListener;

public interface ILogar {
	
    void addListener(LoginListener listener);
	
	void logar (String username, String password);
	
}
