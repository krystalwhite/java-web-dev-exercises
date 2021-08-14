package exercises.technology;

public abstract class AbstractEntity {

    private static long idCounter = 0;

    public static synchronized String createID()
    {
        return String.valueOf(idCounter++);
    }

    public static long getIdCounter() {
        return idCounter;
    }

}
