package presentation;

import model.NewsPaper;

/**
 * Created by bruno.devesa on 19-07-2015.
 */
public class MainUI {

    public  void run(){

        System.out.println("creating the newspaper");
        NewsPaper newsPaper = NewsPaper.getInstance();
        System.out.println("hello, im a the newspaper with name " + newsPaper.getName());

    }
}
