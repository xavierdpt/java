package com.github.xavierdpt.java.apollo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.AppenderRefComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.LoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.RootLoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

public class SubLog4JLogging implements AutoCloseable {

    private final Configuration previousConfiguration;

    public SubLog4JLogging(Configuration previousConfiguration) {
        this.previousConfiguration = previousConfiguration;
    }

    public static SubLog4JLogging init() {
        LoggerContext x = (LoggerContext) LogManager.getContext(false);
        Configuration previousConfiguration = x.getConfiguration();
        x.reconfigure(createConfiguration());
        return new SubLog4JLogging(previousConfiguration);
    }

    public static BuiltConfiguration createConfiguration() {
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
        LayoutComponentBuilder layout = builder.newLayout("PatternLayout")
                .addAttribute("pattern", "%d [%t] %-5level: %msg%n%throwable");
        AppenderComponentBuilder console = builder.newAppender("stdout", ConsoleAppender.PLUGIN_NAME)
                .add(layout);
        AppenderRefComponentBuilder consoleRef = builder.newAppenderRef("stdout");
        RootLoggerComponentBuilder rootLogger = builder.newRootLogger(Level.ERROR)
                .add(consoleRef);
        LoggerComponentBuilder hibernateLogger = builder.newLogger("org.hibernate", Level.TRACE)
                .add(consoleRef);

        builder.add(console);
        builder.add(rootLogger);
        builder.add(hibernateLogger);

        return builder.build();
    }

    @Override
    public void close() {
        LoggerContext x = (LoggerContext) LogManager.getContext(false);
        x.reconfigure(previousConfiguration);
    }
}
