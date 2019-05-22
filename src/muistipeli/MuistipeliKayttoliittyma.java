/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistipeli;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author juha
 */
public class MuistipeliKayttoliittyma extends Application {

    private final BorderPane asettelu = new BorderPane();
    MuistipeliToiminnallisuus toiminta = new MuistipeliToiminnallisuus();
    private final ArrayList<Button> napit = new ArrayList<>();
    private int arvatut = 0;
    private int arvauksia = 0;

    @Override
    public void start(Stage ikkuna) throws Exception {

        this.asettelu.setCenter(alkunakyma());
        Scene nakyma = new Scene(this.asettelu, 400, 400);

        ikkuna.setScene(nakyma);
        ikkuna.setTitle("Muistipeli");
        ikkuna.show();

    }

    private String mikaRuutu(String ruutu) {
        return ruutu;
    }

    private StackPane alkunakyma() {

        StackPane asettelu = new StackPane();
        this.asettelu.setCenter(asettelu);

        Button start = new Button("ALOITA");
        Label tekija = new Label("Muistipeli by Juha");

        asettelu.getChildren().add(start);
        asettelu.getChildren().add(tekija);
        asettelu.setAlignment(start, Pos.CENTER);
        asettelu.setAlignment(tekija, Pos.BOTTOM_RIGHT);

        start.setOnAction((event) -> peliruutu());
        return asettelu;
    }

    public GridPane peliruutu() {
        this.arvauksia = 0;
        GridPane peliruutu = new GridPane();

        Button eka = new Button(" ");
        eka.setFont(Font.font("Monospaced", 40));
        Button toka = new Button(" ");
        toka.setFont(Font.font("Monospaced", 40));
        Button kolmas = new Button(" ");
        kolmas.setFont(Font.font("Monospaced", 40));
        Button neljas = new Button(" ");
        neljas.setFont(Font.font("Monospaced", 40));
        Button viides = new Button(" ");
        viides.setFont(Font.font("Monospaced", 40));
        Button kuudes = new Button(" ");
        kuudes.setFont(Font.font("Monospaced", 40));
        Button seitsemas = new Button(" ");
        seitsemas.setFont(Font.font("Monospaced", 40));
        Button kahdeksas = new Button(" ");
        kahdeksas.setFont(Font.font("Monospaced", 40));
        Button yhdeksas = new Button(" ");
        yhdeksas.setFont(Font.font("Monospaced", 40));
        Button kymmenes = new Button(" ");
        kymmenes.setFont(Font.font("Monospaced", 40));
        Button yhdestoista = new Button(" ");
        yhdestoista.setFont(Font.font("Monospaced", 40));
        Button kahdestoista = new Button(" ");
        kahdestoista.setFont(Font.font("Monospaced", 40));
        Button kolmastoista = new Button(" ");
        kolmastoista.setFont(Font.font("Monospaced", 40));
        Button neljastoista = new Button(" ");
        neljastoista.setFont(Font.font("Monospaced", 40));
        Button viidestoista = new Button(" ");
        viidestoista.setFont(Font.font("Monospaced", 40));
        Button kuudestoista = new Button(" ");
        kuudestoista.setFont(Font.font("Monospaced", 40));

        GridPane ruudukko = new GridPane();
        ruudukko.setVgap(10);
        ruudukko.setHgap(10);
        ruudukko.setPadding(new Insets(10, 10, 10, 10));
        ruudukko.add(eka, 0, 0);
        ruudukko.add(toka, 0, 1);
        ruudukko.add(kolmas, 0, 2);
        ruudukko.add(kolmastoista, 0, 3);
        ruudukko.add(neljas, 1, 0);
        ruudukko.add(viides, 1, 1);
        ruudukko.add(kuudes, 1, 2);
        ruudukko.add(neljastoista, 1, 3);
        ruudukko.add(seitsemas, 2, 0);
        ruudukko.add(kahdeksas, 2, 1);
        ruudukko.add(yhdeksas, 2, 2);
        ruudukko.add(viidestoista, 2, 3);
        ruudukko.add(kymmenes, 3, 0);
        ruudukko.add(yhdestoista, 3, 1);
        ruudukko.add(kahdestoista, 3, 2);
        ruudukko.add(kuudestoista, 3, 3);

        eka.setOnMouseClicked((event) -> {
            showMerkki(0, 0, eka);
            pelaa(0, 0, eka);
        });

        toka.setOnMouseClicked((event) -> {
            showMerkki(0, 1, toka);
            pelaa(0, 1, toka);
        });

        kolmas.setOnMouseClicked((event) -> {
            showMerkki(0, 2, kolmas);
            pelaa(0, 2, kolmas);
        });

        kolmastoista.setOnMouseClicked((event) -> {
            showMerkki(0, 3, kolmastoista);
            pelaa(0, 3, kolmastoista);
        });

        neljas.setOnMouseClicked((event) -> {
            showMerkki(1, 0, neljas);
            pelaa(1, 0, neljas);
        });

        viides.setOnMouseClicked((event) -> {
            showMerkki(1, 1, viides);
            pelaa(1, 1, viides);
        });

        kuudes.setOnMouseClicked((event) -> {
            showMerkki(1, 2, kuudes);
            pelaa(1, 2, kuudes);
        });

        seitsemas.setOnMouseClicked((event) -> {
            showMerkki(2, 0, seitsemas);
            pelaa(2, 0, seitsemas);
        });

        neljastoista.setOnMouseClicked((event) -> {
            showMerkki(1, 3, neljastoista);
            pelaa(1, 3, neljastoista);
        });

        seitsemas.setOnMouseClicked((event) -> {
            showMerkki(2, 0, seitsemas);
            pelaa(2, 0, seitsemas);
        });

        kahdeksas.setOnMouseClicked((event) -> {
            showMerkki(2, 1, kahdeksas);
            pelaa(2, 1, kahdeksas);
        });

        yhdeksas.setOnMouseClicked((event) -> {
            showMerkki(2, 2, yhdeksas);
            pelaa(2, 2, yhdeksas);
        });

        viidestoista.setOnMouseClicked((event) -> {
            showMerkki(2, 3, viidestoista);
            pelaa(2, 3, viidestoista);
        });

        kymmenes.setOnMouseClicked((event) -> {
            showMerkki(3, 0, kymmenes);
            pelaa(3, 0, kymmenes);
        });

        yhdestoista.setOnMouseClicked((event) -> {
            showMerkki(3, 1, yhdestoista);
            pelaa(3, 1, yhdestoista);
        });

        kahdestoista.setOnMouseClicked((event) -> {
            showMerkki(3, 2, kahdestoista);
            pelaa(3, 2, kahdestoista);
        });

        kuudestoista.setOnMouseClicked((event) -> {
            showMerkki(3, 3, kuudestoista);
            pelaa(3, 3, kuudestoista);
        });

        ruudukko.setAlignment(Pos.CENTER);
        this.asettelu.setCenter(ruudukko);
        return peliruutu;
    }
    
    private VBox loppuNakyma() {
        VBox asettelu = new VBox();
        this.asettelu.setCenter(asettelu);
        
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setPadding(new Insets(10, 10, 10, 10));
        asettelu.setSpacing(10);
        
        Label voitto = new Label("Voitit!");
        voitto.setFont(Font.font("Monospaced", 40));
        
        Label arvaukset = new Label(String.valueOf(this.arvauksia) + " Arvausta");
        arvaukset.setFont(Font.font("Monospaced", 40));    
        
        Button AloitaAlusta = new Button("UUDELLEEN");
        AloitaAlusta.setFont(Font.font("Monospaced", 40));
        
        asettelu.getChildren().add(voitto);
        asettelu.getChildren().add(arvaukset);
        asettelu.getChildren().add(AloitaAlusta);
        
        AloitaAlusta.setOnMouseClicked((event) -> { 
            peliruutu();
        });
        
        return asettelu;
    }

    public void kaynnista() {
        launch(MuistipeliKayttoliittyma.class);

    }

    private void showMerkki(int rivi, int sarake, Button napinNimi) {
        napinNimi.setText(toiminta.getMerkki(rivi, sarake));

    }

    private void pelaa(int rivi, int sarake, Button nappi) {
        int pelaa = toiminta.pelaa(rivi, sarake, nappi);
        napit.add(nappi);
        if (pelaa == 2) {
            napit.forEach((kaikkiNapit) -> {
                kaikkiNapit.setText(" ");

            });
            this.arvauksia++;
            napit.clear();
        } else if (pelaa == 3) {
            napit.get(2).setText(" ");
            napit.remove(2);
            napit.forEach((napit) -> {
                napit.setDisable(true);

            });
            this.arvauksia++;
            arvatut++;
            napit.clear();
        }
        if (arvatut == 8) {
            loppuNakyma();
        }
    }

}
