package com.criscode.factorymethod.crossplatformUI;

public class HTMLButton implements Button{
    public void render() {
        System.out.println("Render button UI of HTML");
    }

    public void onClick() {
        System.out.println("Click button on Web");
    }
}
