package app;

import java.io.Serializable;

public class EchoForm implements Serializable{

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
