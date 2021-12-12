package Exercise04Interface.foodShortage;

public class Pet implements Birthable{
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return this.birthday;
    }
}
