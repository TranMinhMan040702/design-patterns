package com.criscode.factorymethod.crossplatformUI;

public class WebDialog extends Dialog{
    public Button createButton() {
        return new HTMLButton();
    }
}
