package model;

/**
 * Created by bruno.devesa on 19-07-2015.
 */
public class NewsPaper {




    private String name;
    private static NewsPaper ourInstance;

    public static synchronized NewsPaper getInstance() {
        if (ourInstance == null){
            ourInstance = new NewsPaper();
            ourInstance.setName("Diario de Notícias");

        }
        else{
            System.out.println("only one single instance allowed man..");
        }
        return ourInstance;
    }

    private NewsPaper() {
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
