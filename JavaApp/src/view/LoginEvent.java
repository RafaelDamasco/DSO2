package view;

import java.util.EventObject;

public class LoginEvent extends EventObject{
	
	protected boolean resultadoLogin;
	
	public LoginEvent(Object origim, boolean resultadoLogin) {
		super(origim);
		this.resultadoLogin = resultadoLogin;
	}

	public boolean isResultadoLogin() {
		return resultadoLogin;
	}

	public void setResultadoLogin(boolean resultadoLogin) {
		this.resultadoLogin = resultadoLogin;
	}
	
	
}
