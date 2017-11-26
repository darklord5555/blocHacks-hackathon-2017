package application.adminClient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ActionController 
{
	private Socket connection;
	private boolean connected;
	@FXML
	private Button searchButton;
	
	@FXML
	private Button addButton;
	
	public void setUpNetworking(String ip, int port)
	{
		try {
			connection = new Socket(ip, port);
			connected =true;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}


	public void search(ActionEvent ae)
	{	
		try
		{
			Stage primaryStage= new Stage();
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("Login.fxml")); 
			Parent root= loader.load(); 
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void add(ActionEvent ae) 
	{		
		try
		{
			Stage primaryStage= new Stage();
			FXMLLoader loader = new FXMLLoader(); 
			loader.setLocation(getClass().getResource("Login.fxml")); 
			Parent root= loader.load(); 
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e)
		{
			
		}
	}
	
}
