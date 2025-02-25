package net.javaguides.finterfaces.supplier;

import java.util.function.Supplier;

class Configuration {
    private String url;
    private int timeout;

    public Configuration(String url, int timeout) {
        this.url = url;
        this.timeout = timeout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "url='" + url + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}

public class DefaultConfigurationSupplierExample {

    public static void main(String[] args) {
        // Define the Supplier that provides a default configuration
        Supplier<Configuration> defaultConfiguration = () -> new Configuration("http://localhost:8080", 50000);

        Configuration configuration = defaultConfiguration.get();

        System.out.println(configuration.toString());
    }
}
