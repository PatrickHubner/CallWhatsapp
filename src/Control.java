import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;

import javax.swing.JOptionPane;

public class Control {
	
	public String url = "https://wa.me/";
	public String number;
	public String Text;
	
	
	
	
	Main g1 = new Main();
	ScreenTwo s2 = new ScreenTwo();
	
	

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void number() {
		try{
	        URI link = new URI(url + "55" + number);
	        Desktop.getDesktop().browse(link);
	    }catch(Exception erro){
	            System.out.println(erro);
	        }
	    }
	
	public void programmedNumber() {
		try{
			String encodedText = URLEncoder.encode(Text, "UTF-8");
	        URI link = new URI(url + "55" + number + "?text=" + encodedText.replaceAll(" ", "%"));
	        Desktop.getDesktop().browse(link);
	    }catch(Exception erro){
	            System.out.println(erro);
	    }	
	}
}
	
	
	
	
	
	

