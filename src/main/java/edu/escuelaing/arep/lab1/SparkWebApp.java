package edu.escuelaing.arep.lab1;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author daniel
 */
public class SparkWebApp {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Media y Desviacion estandar</h2>"
                + "<form action=\"/results\">"
                + "  Numeros a ingresar:<br>"
                + "  <input type=\"text\" name=\"number\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        String numbers[]=req.queryParams("number").split(",");
        System.out.println(Integer.parseInt(numbers[1]));
        LinkedLista lista = new LinkedLista();
        for (int i = 0; i < numbers.length; i++) {
            lista.addNode(Integer.parseInt(numbers[i]));
        }

        double meanNumber= App.mean(lista);
        double deviaionNumber= App.deviation(lista);

        return "El valor de la media es: "+ meanNumber + " y el valor de la desviación estandar es: " + deviaionNumber;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}