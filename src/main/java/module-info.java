module com.kurswork.kursovaya {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.kurswork.kursovaya to javafx.fxml;
    exports com.kurswork.kursovaya;
}