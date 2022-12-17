import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebCrawler {

    public static void main(String[] args) {

        try {
            Document document = Jsoup.connect("https://domain.com").get();
            System.out.println("Title : " +document.title());
        } catch (IOException ex) {
            Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}