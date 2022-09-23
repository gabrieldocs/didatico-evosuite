package example;

import java.util.Date;

public class App {

    public String up() {
        return "[" + new Date() + "] > Applicativo UP";
    }

    public String down() {
        return "[" + new Date() + "] > Applicativo DOWN";
    }
}
