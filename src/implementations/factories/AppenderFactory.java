package implementations.factories;

import enums.ReportLevel;
import implementations.appenders.ConsoleAppender;
import implementations.appenders.FileAppender;
import interfaces.Appender;
import interfaces.Factory;
import interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {

    LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split(" ");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;

        if ("ConsoleAppender".equals(appenderType)) {
            appender = new ConsoleAppender(layout);

        } else if ("FileAppender".equals(appenderType)) {
            appender = new FileAppender(layout);

        }
        if (tokens.length >= 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }
        return appender;
    }
}
