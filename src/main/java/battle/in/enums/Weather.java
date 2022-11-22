package battle.in.enums;

public enum Weather {
    CLEAR_SKIES(10000),
    HARSH_SUNLIGHT,
    EXTREMELY_HARSH_SUNLIGHT,
    RAIN,
    HEAVY_RAIN,
    SANDSTORM,
    HAIL;

    private int duration;

    Weather(int duration) {
        this.duration = duration;
    }

    Weather() {
        this.duration = 6;
    }

    public int getDuration() {
        return duration;
    }

    public void decreaseDuration() {
        duration = duration - 1;
    }
}
