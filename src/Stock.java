public class Stock {
    private String date;
    private float openValue;
    private float highValue;
    private float lowValue;
    private float closeValue;
    private int volume;

    public Stock(String date, float openValue, float highValue, float lowValue, float closeValue, int volume) {
        this.date = date;
        this.openValue = openValue;
        this.highValue = highValue;
        this.lowValue = lowValue;
        this.closeValue = closeValue;
        this.volume = volume;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getOpenValue() {
        return openValue;
    }

    public void setOpenValue(float openValue) {
        this.openValue = openValue;
    }

    public float getHighValue() {
        return highValue;
    }

    public void setHighValue(float highValue) {
        this.highValue = highValue;
    }

    public float getLowValue() {
        return lowValue;
    }

    public void setLowValue(float lowValue) {
        this.lowValue = lowValue;
    }

    public float getCloseValue() {
        return closeValue;
    }

    public void setCloseValue(float closeValue) {
        this.closeValue = closeValue;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
