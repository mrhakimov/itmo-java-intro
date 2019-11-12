package expression;

/**
 * @author: Muhammadjon Hakimov
 * created: 16.12.2018 15:12:27
 */

public class Variable implements TripleExpression {
    private String name;

    public Variable(String name) {
        assert name != null : "Name of variable is null";
        this.name = name;
    }

    public int evaluate(int x, int y, int z) {
        assert name.equals("x") || name.equals("y") || name.equals("z") : "ERROR: Wrong variable name!!!";
        switch (name) {
            case "x":
                return x;
            case "y":
                return y;
            case "z":
                return z;
        }
        return 0;
    }
}
