package implementations;

import enums.ReportLevel;
import interfaces.Layout;

public class FileAppender extends BaseAppender {

    public FileAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {

    }
}
