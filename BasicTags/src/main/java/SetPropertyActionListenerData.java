import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "setPropertyActionListener", eager = true)
@SessionScoped
public class SetPropertyActionListenerData implements Serializable{
	private static final long serialVersionUID = 1L;
	public String data = "1";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}