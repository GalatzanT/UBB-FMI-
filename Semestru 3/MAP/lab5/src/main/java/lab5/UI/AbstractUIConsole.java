package lab5.UI;

import lab5.service.Service;

public abstract class AbstractUIConsole {
    Service serviceconsole;

    public AbstractUIConsole(Service serviceconsole){
        this.serviceconsole=serviceconsole;
    }
}
