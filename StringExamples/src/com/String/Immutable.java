package src.com.String;

public class Immutable 
{
	private final String name;

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
