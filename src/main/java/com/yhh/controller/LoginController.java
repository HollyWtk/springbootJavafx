package com.yhh.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yhh.DesktopApplication;
import com.yhh.entity.User;
import com.yhh.service.IUserService;
import com.yhh.view.FundListView;
import com.yhh.view.RegisterView;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月28日  
 */
@FXMLController
public class LoginController {
    
    @FXML
    private TextField usernameText;
    
    @FXML
    private TextField passwordText;
    
    @Autowired
    private IUserService userService;
    
    @FXML
    private void register() {
        DesktopApplication.showView(RegisterView.class);
    }
    
    @FXML
    private void login() {
        String username = usernameText.getText();
        String password = passwordText.getText();
        User user = userService.getOne(new QueryWrapper<User>().eq("account", username));
        if(user == null) {
            Alert alert = new Alert(AlertType.WARNING, "账户名不存在",ButtonType.OK);
            alert.showAndWait();
        }else if(!password.equals(user.getPassword())) {
            Alert alert = new Alert(AlertType.WARNING, "账户/密码错误",ButtonType.OK);
            alert.showAndWait();
        }else {
            DesktopApplication.showView(FundListView.class);
        }
    }
    
}
