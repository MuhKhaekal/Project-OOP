import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

// Abstract class untuk representasi sebuah negara
abstract class Negara {
    private String nama;
    private int emas;
    private int perak;
    private int perunggu;

    public Negara(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getEmas() {
        return emas;
    }

    public void setEmas(int emas) {
        this.emas = emas;
    }

    public int getPerak() {
        return perak;
    }

    public void setPerak(int perak) {
        this.perak = perak;
    }

    public int getPerunggu() {
        return perunggu;
    }

    public void setPerunggu(int perunggu) {
        this.perunggu = perunggu;
    }

    // Abstract method untuk menghitung total poin negara
    public abstract int hitungTotalPoin();
}

// Kelas untuk representasi negara dengan medali emas, perak, dan perunggu
class NegaraMedali extends Negara {
    public NegaraMedali(String nama) {
        super(nama);
    }

    @Override
    public int hitungTotalPoin() {
        return (getEmas() * 3) + (getPerak() * 2) + getPerunggu();
    }
}

// Kelas untuk representasi negara dengan medali emas dan perunggu
class NegaraPerunggu extends Negara {
    public NegaraPerunggu(String nama) {
        super(nama);
    }

    @Override
    public int hitungTotalPoin() {
        return (getEmas() * 3) + getPerunggu();
    }
}

class SeaGamesApp extends Application {
    private List<Negara> daftarNegara = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sea Games - Klasemen");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label labelEmas = new Label("Emas:");
        grid.add(labelEmas, 0, 0);

        TextField textFieldEmas = new TextField();
        grid.add(textFieldEmas, 1, 0);

        Label labelPerak = new Label("Perak:");
        grid.add(labelPerak, 0, 1);

        TextField textFieldPerak = new TextField();
        grid.add(textFieldPerak, 1, 1);

        Label labelPerunggu = new Label("Perunggu:");
        grid.add(labelPerunggu, 0, 2);

        TextField textFieldPerunggu = new TextField();
        grid.add(textFieldPerunggu, 1, 2);

        Button buttonTambah = new Button("Tambahkan Negara");
        grid.add(buttonTambah, 0, 3, 2, 1);

        TextArea textAreaHasil = new TextArea();
        textAreaHasil.setEditable(false);
        grid.add(textAreaHasil, 0, 4, 2, 1);

        buttonTambah.setOnAction(e -> {
            String namaNegara = "Negara " + (daftarNegara.size() + 1);
            int emas = Integer.parseInt(textFieldEmas.getText());
            int perak = Integer.parseInt(textFieldPerak.getText());
            int perunggu = Integer.parseInt(textFieldPerunggu.getText());

            Negara negara;
            if (perak > 0) {
                negara = new NegaraMedali(namaNegara);
                negara.setPerak(perak);
            } else {
                negara = new NegaraPerunggu(namaNegara);
            }
            negara.setEmas(emas);
            negara.setPerunggu(perunggu);

            daftarNegara.add(negara);
            updateHasilKlasemen(textAreaHasil);
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateHasilKlasemen(TextArea textAreaHasil) {
        StringBuilder hasil = new StringBuilder();
        hasil.append("Klasemen Sea Games:\n");

        // Sorting berdasarkan total poin
        daftarNegara.sort((n1, n2) -> n2.hitungTotalPoin() - n1.hitungTotalPoin());

        int posisi = 1;
        for (Negara negara : daftarNegara) {
            hasil.append(posisi).append(". ").append(negara.getNama()).append(" - ").append(negara.hitungTotalPoin()).append(" poin\n");
            posisi++;
        }

        textAreaHasil.setText(hasil.toString());
    }
}
