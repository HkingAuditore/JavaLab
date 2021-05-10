package LabOne.Atm;

import java.util.Scanner;


public class AtmUserInterface {
    private final Scanner _scaner = new Scanner(System.in);
    private final AtmSimulator _atmSimulator;


    AtmUserInterface(AtmSimulator atmSimulator) {
        this._atmSimulator = atmSimulator;
    }

    public void show(String content) {
        System.out.println(content);
    }


    /**
     * 显示菜单
     */
    public void showMenu() {
        show("【主菜单】");
        for (int i = 0; i < _atmSimulator.getMethods().size(); i++) {
            AtmMethodHandler method = _atmSimulator.getMethods().get(i);
            show(i + ": " + method.getMethodName());
        }
    }

    /**
     * 打印分割线
     */
    public void showLine() {
        show("=======================================");
    }

    /**
     * @param tint 输入提示，后面自动加冒号
     * @return
     */
    public double getInputDouble(String tint) {
        show(tint + ":");
        return _scaner.nextDouble();
    }

    /**
     * @param tint 输入提示，后面自动加冒号
     * @return
     */
    public int getInputInt(String tint) {
        show(tint + ":");
        return _scaner.nextInt();
    }
}
