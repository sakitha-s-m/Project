package app;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

public class App {

    public static final int         JAVALIN_PORT    = 7001;
    public static final String      CSS_DIR         = "css/";
    public static final String      IMAGES_DIR      = "images/";

    public static void main(String[] args) {
        // Create our HTTP server and listen in port 7000
        Javalin app = Javalin.create(config -> {
            config.registerPlugin(new RouteOverviewPlugin("/help/routes"));
            
            // Uncomment this if you have files in the CSS Directory
            config.addStaticFiles(CSS_DIR);

            // Uncomment this if you have files in the Images Directory
            config.addStaticFiles(IMAGES_DIR);
        }).start(JAVALIN_PORT);


        // Configure Web Routes
        configureRoutes(app);
    }

    public static void configureRoutes(Javalin app) {
        // All webpages are listed here as GET pages
        app.get(PageIndex.URL, new PageIndex());

        // Add / uncomment POST commands for any pages that need web form POSTS
        app.post(PageIndex.URL, new PageIndex());
    }

}
