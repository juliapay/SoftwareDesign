package Observer.Potcast;

public class Potcast {
    private String name;
    private String url;
    private double length;

    public Potcast(String name, String url, double length) {
        this.name = name;
        this.url = url;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
