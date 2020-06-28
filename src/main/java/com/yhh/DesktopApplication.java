package com.yhh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yhh.view.LoginView;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;

@SpringBootApplication
public class DesktopApplication extends AbstractJavaFxApplicationSupport{
    
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(DesktopApplication.class, LoginView.class, args);
    }

    /**
     * Start.
     *
     * @param stage the stage
     *
     * @exception Exception the exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }

}