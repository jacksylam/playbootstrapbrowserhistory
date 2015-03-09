package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.InternetExplorer;
import views.html.Firefox;
import views.html.Chrome;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
      * Returns the home page.
      * @return The resulting home page.
      */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the Internet Explorer page.
   * @return The resulting Internet Explorer page.
   */
  public static Result internetExplorer() {
    return ok(InternetExplorer.render("Welcome to the Internet Explorer page."));
  }

  /**
   * Returns the firefox page.
   * @return The resulting firefox page.
   */
  public static Result firefox() {
    return ok(Firefox.render("Welcome to the firefox page."));
  }

  /**
   * Returns the chrome page.
   * @return The resulting chrome page.
   */
  public static Result chrome() {
    return ok(Chrome.render("Welcome to the chrome page."));
  }
}
