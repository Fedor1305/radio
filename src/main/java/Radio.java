
public class Radio {
    public int stationNumbers;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;

    private int minVolume = 0;

    public int getStationNumbers() {
        return stationNumbers;
    }

    public void setStationNumbers(int newStationNumbers) {
        if (newStationNumbers < minStation) {
            newStationNumbers = maxStation;
        }
        if (newStationNumbers > maxStation) {
            newStationNumbers = minStation;
        }
        stationNumbers = newStationNumbers;
    }

    public void next () {
        int target = stationNumbers + 1;
        setStationNumbers(target);
    }

    public void prev () {
        int target = stationNumbers - 1;
        setStationNumbers(target);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxAndMinVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume () {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
