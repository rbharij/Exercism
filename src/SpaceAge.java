//    Earth: orbital period 365.25 Earth days, or 31557600 seconds
//    Mercury: orbital period 0.2408467 Earth years
//    Venus: orbital period 0.61519726 Earth years
//    Mars: orbital period 1.8808158 Earth years
//    Jupiter: orbital period 11.862615 Earth years
//    Saturn: orbital period 29.447498 Earth years
//    Uranus: orbital period 84.016846 Earth years
//    Neptune: orbital period 164.79132 Earth years

public class SpaceAge {

    private double ageInSecond;

    public SpaceAge(double ageInSecond) {
        this.ageInSecond = ageInSecond;
    }

    public double getSeconds() {
        return ageInSecond;
    }

    public double onEarth() {

        return ageInSecond / (365.25 * 24 * 60 * 60) ;
    }

    public double onMercury() {

        return onEarth() / 0.2408467;
    }

    public double onVenus() {
        return onEarth() / 0.61519726;
    }

    public double onMars() {
        return onEarth() / 1.8808158;
    }

    public double onJupiter() {
        return onEarth() / 11.862615;
    }

    public double onSaturn() {
        return onEarth() / 29.447498;
    }

    public double onUranus() {
        return onEarth() / 84.016846;
    }

    public double onNeptune() {
        return onEarth() / 164.79132;
    }
}
