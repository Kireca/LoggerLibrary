package implementations;

import interfaces.Appender;
import interfaces.Layout;

public abstract class BaseAppender implements Appender {

    Layout layout;

    public BaseAppender(Layout layout) {
        this.layout = layout;
    }
}
