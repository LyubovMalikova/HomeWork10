import java.util.concurrent.Callable;

public class Radio {
    private int CurrentRadioStation;
    private int CurrentVolume;

    public int getCurrentRadioStation() {
        return CurrentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        CurrentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (CurrentRadioStation < 9) {
            CurrentRadioStation++;
        } else {
            CurrentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (CurrentRadioStation > 0) {
            CurrentRadioStation = CurrentRadioStation - 1;
        } else {
            CurrentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        CurrentVolume = newCurrentVolume;
    }

    public void increaseCurrentVolume() {
        if (CurrentVolume < 10) {
            CurrentVolume++;
        } else {
            CurrentVolume = 0;
        }
    }

    public void reductionCurrentVolume() {
        if (CurrentVolume > 0) {
            CurrentVolume = CurrentVolume - 1;
        } else {
            CurrentVolume = 0;
        }
    }
}