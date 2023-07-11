package dev.neverrieght.kolodischi_transport;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import org.w3c.dom.html.HTMLLinkElement;

import java.io.IOException;
import java.util.*;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Kolodischi Transport");
        stage.setScene(scene);

        WebClient webClient = new WebClient(BrowserVersion.CHROME);

        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        String webPageURL = "https://kolodischi.by/raspisanie-avtobusov/2765-mihailov-kut-na-minsk";


        try {

            HtmlPage page = webClient.getPage(webPageURL);

            List<HtmlTableDataCell> timesList = page.getByXPath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td |" +
                    "/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr[4]/td |" +
                    "/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr[5]/td |" +
                    "/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr[6]/td");

            List<HtmlTableDataCell> routeNumber = page.getByXPath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/div[1]/table/tbody/tr[1]/td");

            System.out.println(routeNumber.get(0).getTextContent().trim());

            for (HtmlTableDataCell td : timesList) {
                System.out.print(td.getTextContent().trim());
            }
//            /html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/ul/li[1]/a/i
//            System.out.println(page.getTitleText());

        } catch (FailingHttpStatusCodeException | IOException e) {
            e.printStackTrace();
        }


        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}