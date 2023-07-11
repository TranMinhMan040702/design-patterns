package com.criscode.factorymethod.crossplatformUI;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
