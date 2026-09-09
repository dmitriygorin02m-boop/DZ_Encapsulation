package ru.netology.lombok;

public class RadioLombok {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;// Текущая радиостанция

    public RadioLombok() {
    }

    public RadioLombok(int minRadioStation, int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = minRadioStation;
    }
/*
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

 */

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {  //Переключение радиостанции +
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void setRewRadioStation() {  //Переключение радиостанции -
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int soundVolume = minSoundVolume; // громкость звука

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > maxSoundVolume) {
            newSoundVolume = maxSoundVolume;
        }
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public void setIncreaseSoundVolume() {  //увеличение громкости
        if (soundVolume < maxSoundVolume) {
            soundVolume++;
        } else {
            this.soundVolume = soundVolume;
        }
    }

    public void setDecreasingVolume() {  //Уменьшение громкости
        if (soundVolume > minSoundVolume) {
            soundVolume--;
        } else {
            this.soundVolume = soundVolume;
        }
    }
}
