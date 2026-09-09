package ru.netology.stats;

public class Radio {
    public int currentRadioStation;// Текущая радиостанция

    public int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
            //newCurrentRadioStation = currentRadioStation;
        }
        if (newCurrentRadioStation < 0) {
            // newCurrentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {  //Переключение радиостанции +
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void setRewRadioStation() {  //Переключение радиостанции -
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int soundVolume; // громкость звука

    public int maxSoundVolume = 100;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setIncreaseSoundVolume() {  //увеличение громкости
        if (soundVolume < maxSoundVolume) {
            soundVolume++;
        } else {
            soundVolume = soundVolume;
        }
    }

    public void setDecreasingVolume() {  //Уменьшение громкости
        if (soundVolume > 0) {
            soundVolume--;
        } else {
            soundVolume = soundVolume;
        }
    }

}