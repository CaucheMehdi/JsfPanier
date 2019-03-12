
import java.io.Serializable;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped

@SuppressWarnings("serial")

public class HelloClass implements Serializable{
	String message = "Hello Java Server Faces On Eclipse IDE!";
	
	public String getMessage() {
		return message;
	}
}