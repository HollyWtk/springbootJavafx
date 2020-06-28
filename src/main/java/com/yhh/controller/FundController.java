package com.yhh.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yhh.entity.Fund;
import com.yhh.service.IFundService;
import com.yhh.third.serivce.FundDataService;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.extern.slf4j.Slf4j;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月24日  
 */
@FXMLController
@Slf4j
public class FundController {

    @FXML
    private TableView<Fund> fundTable;

    @FXML
    private TableColumn<Fund, String> fundCode;

    @FXML
    private TableColumn<Fund, String> name;

    @FXML
    private TableColumn<Fund, String> dwjz;

    @FXML
    private TableColumn<Fund, String> gsz;

    @FXML
    private TableColumn<Fund, String> gszzl;

    @FXML
    private TableColumn<Fund, String> gztime;
    
    @FXML
    private TableColumn<Fund, String> Sc;

    @FXML
    private TextField fundCodeInput;

    @Autowired
    private IFundService fundService;


    @FXML
    public void initialize() {
        List<Fund> list = fundService.initData();
        fundCode.setCellValueFactory(cellData -> cellData.getValue().fundcodeProperty());
        name.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        dwjz.setCellValueFactory(cellData -> cellData.getValue().dwjzProperty());
        gsz.setCellValueFactory(cellData -> cellData.getValue().gszProperty());
        gszzl.setCellValueFactory(cellData -> cellData.getValue().gszzlProperty());
        gztime.setCellValueFactory(cellData -> cellData.getValue().gztimeProperty());
        Sc.setCellFactory((col)->{
            TableCell<Fund, String> cell = new TableCell<Fund, String>(){

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    //按钮显示文字
                    Button button2 = new Button("删除");
                    //按钮点击事件
                    button2.setOnMouseClicked((col) -> {
                        //获取list列表中的位置，进而获取列表对应的信息数据
                        Fund fund = list.get(getIndex());
                        fundService.removeById(fund.getId());
                        initialize();
                    });

                    if (empty) {
                        //如果此列为空默认不添加元素
                        setText(null);
                        setGraphic(null);
                    } else {
                        //加载按钮
                        this.setGraphic(button2);
                    }
                }

            };
            return cell;
        });
        fundTable.setItems(fundService.initData());
    }
    @FXML
    private void addFoud() throws IOException {
        String input = fundCodeInput.getText();
        try {
            Fund fund = FundDataService.getData(input);
            fundService.save(fund);
            initialize();
        } catch (Exception e) {
            log.error(e.getMessage());
            Alert alert = new Alert(AlertType.WARNING, "基金不存在",ButtonType.OK);
            alert.showAndWait();
        }
    }

}
