package app;

import java.util.ArrayList;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PageIndex implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        String html = "<html>";

        // html opening
        html += """
            <!DOCTYPE html>
            <html lang="en">
                """;

        // head section
        html += """
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Home Page</title>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
                <link rel="stylesheet" href="style.css">
            </head>
                """;
            
        // body section
        html += """
            <body>
            <!-- <header>
                    <a href="#"><img src="" alt="Logo"></a>
                    <ul>
                        <li>Home</li>
                        <li>Home</li>
                        <li>Home</li>
                        <li>Home</li>
                    </ul>
            </header> -->
            <main>
                
                <div class="container">
                    <div class="forms-container">
                      <div class="signin-signup">
                  
                        <form action="#" class="sign-in-form">
                          <h2 class="title">Sign In </h2>
                          <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Username" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password" />
                          </div>
                          <input type="submit" value="Login" class="btn solid" />
                          <p class="social-text">Or Sign in with social platforms</p>
                  
                          
                          <div class="social-media">
                            <a href="#" class="social-icon">
                              <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-linkedin-in"></i>
                            </a>
                          </div>
                        </form>
                  
                        
                        <form action="#" class="sign-up-form">
                          <h2 class="title">Sign Up</h2>
                          <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="First Name" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Last Name" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-user-check"></i>
                            <input type="text" placeholder="Username" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-envelope"></i>
                            <input type="email" placeholder="Email" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-phone"></i>
                            <input type="tel" placeholder="Mobile" />
                          </div>
                          <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password" />
                          </div>
                          <input type="submit" class="btn" value="Sign up" />
                          <p class="social-text">Or Sign up with social platforms</p>
                  
                          
                          <div class="social-media">
                            <a href="#" class="social-icon">
                              <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                              <i class="fab fa-linkedin-in"></i>
                            </a>
                  
                          </div>
                        </form>
                      </div>
                    </div>
                  
                    
                    <div class="panels-container">
                      <div class="panel left-panel">
                        <div class="content">
                          <h3>New To Our Website ?</h3>
                          <p>
                            Click the Sign Up button to see the effect...
                          </p>
                          <button class="btn transparent" id="sign-up-btn">
                            Sign up
                          </button>
                        </div>
                        <img src="https://cdn-icons-png.flaticon.com/512/4140/4140048.png" class="image" alt="2nd Pic" />
                      </div>
                      <div class="panel right-panel">
                        <div class="content">
                          <h3>One of us ?</h3>
                          <p>
                            Click the Sign In to see the effect
                          </p>
                          <button class="btn transparent" id="sign-in-btn">
                            Sign in
                          </button>
                        </div>
                        <img src="https://cdn-icons-png.flaticon.com/512/4140/4140048.png" class="image" alt="1 Pic" />
                      </div>
                  
                    </div>
                  </div>
            </main>
            <footer></footer>
                """;
        
        // script file
        html += "<script src='script.js'></script>";

        // end the web page
        html += "</body>" + "</html>";

        context.html(html);
    }
}

