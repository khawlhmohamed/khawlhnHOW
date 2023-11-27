public class player {
    private String name;
    private String position;
    private int age;

    public player(String s, String p, int a) {
        name = s;
        position = p;
        age = a;
    }

    public String toString() {
        String s = "Name: " + name + "Position:" + position + "Age:" + age;
        return s;

    }
    public String getPosition()
    {
        return position;
    }

    public int getAge() {
        return age;
    }
}
