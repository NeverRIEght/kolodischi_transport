module dev.neverrieght.kolodischi_transport {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens dev.neverrieght.kolodischi_transport to javafx.fxml;
    exports dev.neverrieght.kolodischi_transport;
}