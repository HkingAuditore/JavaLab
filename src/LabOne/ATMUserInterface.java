package LabOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ATMUserInterface {
	private final Scanner   _scaner = new Scanner(System.in);
	private List<AtmMethod> methods = new ArrayList<AtmMethod>();

	/** 增加一个菜单功能
	 * @param method 方法(lambda表达式)
	 */
	public void addMethod(AtmMethod method){
		methods.add(method);
	}
	public void Show(String content){
		System.out.println(content);
	}

	public void showMenu(){
		Show("Main menu");
		for (int i = 0; i < methods.size(); i++) {
			AtmMethod method = methods.get(i);
			Show(i + ": " +method.methodName);
		}
	}
}
