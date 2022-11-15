public abstract class Player {

    private String name="User";

    public Player(){}

    public Player(String name){
        setName(name);
    }

    public final void setName(String name){
        if (name!=null && name.matches("^[a-zA-Z0-9\\-_\\.]{3,}$"))
           this.name=name;
        else
//            System.err.println("Nieprawidłowe imie");
            throw new IllegalArgumentException("Nieprawidłowe imie");
    }

    public final String getImie() {
        return name;
    }

    public abstract int guess();
}
// regex 101
