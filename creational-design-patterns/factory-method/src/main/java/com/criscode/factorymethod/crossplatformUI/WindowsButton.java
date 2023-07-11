package com.criscode.factorymethod.crossplatformUI;

public class WindowsButton implements Button{
    public void render() {
        System.out.println("Render button UI of Windows");
    }

    public void onClick() {
        System.out.println("Click button on Windows");
    }
}
