package menu;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import model.DataModel;

import javafx.scene.control.MenuBar;
import java.io.File;

public class MenuController {
    private DataModel _dataModel;

    @FXML
    private MenuBar _menuBar;

    public void initDataModel(DataModel dataModel) {
        if(_dataModel != null){
            throw new IllegalStateException("Model can only be initialized once.");
        }
        _dataModel = dataModel;
    }

    @FXML
    public void load(){
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(_menuBar.getScene().getWindow());
        if(file != null){
            try {
                _dataModel.loadData(file);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @FXML
    public void save(){}

    @FXML
    public void exit(){
        _menuBar.getScene().getWindow().hide();
    }
}
