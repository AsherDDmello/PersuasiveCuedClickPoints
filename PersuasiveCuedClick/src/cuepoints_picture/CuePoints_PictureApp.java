/*
 * Persuasive_CuePoints_PictureApp.java
 */

package cuepoints_picture;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class CuePoints_PictureApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new WelcomeFrame());
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of CuePoints_PictureApp
     */
    public static CuePoints_PictureApp getApplication() {
        return Application.getInstance(CuePoints_PictureApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(CuePoints_PictureApp.class, args);
    }
}
