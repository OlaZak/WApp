import dao.Dao1_0;
import dao.DaoPointOfSale;
import dao.DaoProduct;
import dao.DaoRights;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.Market1_0;
import model.PointOfSale;
import model.Product;
import model.Right;
import services.MenuButton;
import utils.Queries1_0;

import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) {

        DaoRights.addRight(new Right("GUEST"));
        System.out.println(DaoRights.getAll().toString());

        /* JavaFx example....
         First need extend Application from javafx.s..
         in main method add *-- lunch method(args); --*
         Then override public void start(); from javafx Application
        */
  //      launch(args);
    }
    @Override
    public void start(Stage primaryStage){

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        primaryStage.setMaximized(true);
//        primaryStage.setFullScreen(true);
        PointOfSale point = DaoPointOfSale.getPointByPointId(1);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
//        boolean add = scene.getStylesheets().add("application.css");
//        System.out.println("Is added file application.css  " + add);
        primaryStage.setTitle(point.getName());
        primaryStage.setScene(MenuButton.productsInfo(point));
        primaryStage.show();
    }
}



//        Product product = new Product();
//        product.setPointId(2);
//        product.setPrice(900.00);
//        product.setAmount(5.0);
//        product.setName("Apple");
//        product.setDescription("Model X");
//        DaoProduct.addProduct(product);
     //   ArrayList<Product> products = DaoProduct.getProductByPointId(1);
     //   System.out.println(products.toString());
     //   System.out.println(DaoPointOfSale.getPointByPointId(1).toString());
//        Market1_0 market = new Market1_0("ECO");
//        Dao1_0.executeQuery(Queries1_0.CREATE_MARKET(market));
//        for (Market1_0 market1 : Dao1_0.getMarketList()) {
//            System.out.println(market1.toString());
//        }
//        for (Product1_0 productTmp : Dao1_0.getProductList()) {
//            System.out.println(productTmp.toString());
//        }

