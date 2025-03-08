package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Rabbit4 RABBIT;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.RABBIT = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + RABBIT.toString();
    }
}
