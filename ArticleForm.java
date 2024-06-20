package org.example.demo;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.demo.entity.Article;
import org.example.demo.repository.ArticleRepository;

import java.awt.event.ActionEvent;

import static com.sun.javafx.scene.input.TouchPointHelper.reset;

public class ArticleForm {

    public TextField txttile;
    public TextField txtdescription;
    public TextField txtcontent;
    private ArticleRepository articleRepository = new ArticleRepository();


    private void reset() {
        txttile.clear();
        txtdescription.clear();
        txtcontent.clear();

    }

    public void processSave(javafx.event.ActionEvent actionEvent) {
        System.out.println("hehehe");
        Article article = new Article();
        article.setTitle(txttile.getText());
        article.setDescription(txtdescription.getText());
        article.setContent(txtcontent.getText());
        articleRepository.save(article);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Article Saved");
        alert.show();
        reset();
    }

    public void processReset(javafx.event.ActionEvent actionEvent) {
        reset();
    }
}
