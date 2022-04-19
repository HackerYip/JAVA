package user;

public abstract class User {
    protected String name;//共性写在这
    //防止在其他包也要继承到，所以用protect

    public User(String name){
        this.name = name;
    }

    public abstract void menu();
}
