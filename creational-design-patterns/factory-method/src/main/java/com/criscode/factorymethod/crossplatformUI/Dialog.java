package com.criscode.factorymethod.crossplatformUI;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();

}
