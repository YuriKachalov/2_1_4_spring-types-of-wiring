package koschei.models;

public class Egg6 {
    private final Needle7 NEEDLE;

    public Egg6(Needle7 needle) {
        this.NEEDLE = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + NEEDLE.toString();
    }
}
