package com.criscode.factorymethod.crossplatformUI;

public class Main {
    public static void main(String[] args) {
        Dialog dialog1 = new WindowsDialog();
        Dialog dialog2 = new WebDialog();
        dialog1.render();
        dialog2.render();
    }
}
