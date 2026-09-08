package ru.netology.stats;
public class Radio {
    public int currentRadioStation;// Текущая радиостанция

    public int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int newCurrentRadioStation){
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
    public int NextRadioStation;

    public int getNextRadioStation() {
        return NextRadioStation;
    }

    public void setNextRadioStation() {  //Переключение радиостанции +
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }else{
            currentRadioStation = 0;
        }


    }
    public void setRewRadioStation() {  //Переключение радиостанции -
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }else {
            currentRadioStation = maxRadioStation;

        }
    }


    public int soundVolume; // громкость звука

    public int maxSoundVolume = 100;

    public int getSoundVolume() {  // возвращает громкость звука
        return soundVolume;
    }
    public void setSoundVolume(int newSoundVolume) { // меняет громкость звука + условие
        if (newSoundVolume > 100) {
            return;
        }
        if (newSoundVolume < 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public int increaseSoundVolume;

    public int getIncreaseSoundVolume() {
        return increaseSoundVolume;
    }

    public void setIncreaseSoundVolume() {  //увеличение громкости
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }else {
            soundVolume = soundVolume;
        }

    }
    public int decreaseSoundVolume;
    public int getDecreaseSoundVolume() {
        return decreaseSoundVolume;
    }
    public void setDecreasingVolume() {  //Уменьшение громкости
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }else{
            soundVolume = soundVolume;
        }
    }

}