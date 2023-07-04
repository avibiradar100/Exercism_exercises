public class Twofer {
    public String twofer(String name) {

        if(name ==null)
            name="you";
        String res = "One for " + name +", one for me.";
        return res;
    }
}
