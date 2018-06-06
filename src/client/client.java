package client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.datacontract.schemas._2004._07.practicum56library.ArrayOfProduct;
import org.datacontract.schemas._2004._07.practicum56library.Product;
import org.tempuri.*;

import java.util.ArrayList;
import java.util.List;

public class client extends Application {

    ChatService service = new ChatService();
    IChatService serviceimpl = service.getBasicHttpBindingIChatService();

    HBox generalPanel = new HBox();
    VBox buttons = new VBox();
    VBox allProducts = new VBox();
    VBox allBoughtProducts = new VBox();
    String globalUsername = "test";
    Label balance = new Label(serviceimpl.getBalance(globalUsername).toString());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        generalPanel.setMinSize(1000, 600);
        loginPanel();

        root.getChildren().add(generalPanel);

        Scene scene = new Scene(root,1000,600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void loginPanel() {
        generalPanel.getChildren().clear();

        TextField username = new TextField("halo");
        TextField password = new TextField("olah");
        username.setMinSize(200, 50);
        password.setMinSize(200,50);

        Button login = new Button("Login");
        login.setMinSize(100, 50);
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String user = username.getText();
                String pw = password.getText();

                globalUsername = user;

                if (serviceimpl.login(user, pw)) {
                    storePanel();
                }
            }
        });

        Button register = new Button("Register");
        register.setMinSize(100, 50);
        register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
               registerPanel();
            }
        });

        generalPanel.getChildren().addAll(username, password, login, register);

    }

    private void registerPanel() {
        generalPanel.getChildren().clear();

        TextField username = new TextField();
        username.setMinSize(200, 50);

        Label output = new Label();
        output.setMinSize(200, 50);

        Button register = new Button("Register");
        register.setMinSize(100, 50);
        register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String user = username.getText();
                output.setText(serviceimpl.registerCustomer(user));
            }
        });

        Button login = new Button("Back to login");
        login.setMinSize(200, 50);
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
               loginPanel();
            }
        });
        generalPanel.getChildren().addAll(username, output, register, login);
    }

    private void storePanel() {
        generalPanel.getChildren().clear();
        displayProducts();
        displayBoughtProducts();

        buttons.setMinSize(200, 600);
        Button refresh = new Button("Refresh");
        refresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                displayProducts();
            }
        });


        buttons.getChildren().addAll(refresh, balance);

        generalPanel.getChildren().add(allProducts);
        generalPanel.getChildren().add(buttons);
        generalPanel.getChildren().add(allBoughtProducts);
    }


    private void displayProducts() {
        ArrayOfProduct test = serviceimpl.getAllProducts();
        List<Product> products = test.getProduct();
        allProducts.getChildren().clear();

        allProducts.setMinWidth(300);

        for (Product p : products) {
            HBox row = new HBox();
            System.out.println(p.getName().getValue());
            String temp = p.getId() + ": " + p.getName().getValue() + ", $" + p.getPrice() + ", " + p.getStock();
            Label text = new Label(temp);
            text.setMinSize(200, 50);

            Button btn = new Button();
            btn.setText("Koop");
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event)
                {
                    //TODO make order aanroepen
                    displayBoughtProducts();
                    balance.setText(serviceimpl.getBalance(globalUsername).toString());
                    System.out.println(p.getName().getValue());
                }
            });
            row.getChildren().addAll(text, btn);
            allProducts.getChildren().add(row);
        }
    }

    private void displayBoughtProducts() {
        System.out.println(globalUsername);
        ArrayOfProduct test = serviceimpl.getAllBoughtProducts(globalUsername);
        List<Product> boughtProducts = test.getProduct();
        allBoughtProducts.getChildren().clear();

        for (Product p : boughtProducts) {
            String temp = p.getId() + ": " + p.getName().getValue() + ", $" + p.getPrice() + ", " + p.getStock();
            Label text = new Label(temp);
            text.setMinSize(200, 50);
            allBoughtProducts.getChildren().add(text);
        }
    }



}
