package com.company;

import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyEvent;

public class LoginController {

    public ChoiceBox cbTest;

    public void rotar(KeyEvent keyEvent) {

        cbTest.setRotate(cbTest.getRotate() + 3);

    }
}
