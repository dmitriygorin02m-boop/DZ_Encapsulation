package ru.netology.stats;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RadioTest {
    Radio cond = new Radio();

    @Order(1)       //==== Выставляем текущую радиостанцию =====
    @ParameterizedTest
    @CsvSource({
            "-1,0", "0,0", "1,1", "5,5", "8,8", "9,9", "10,9"
    })
    public void WeSetTheCurrentRadioStation(int setCurrentRadioStation, int expected) {

        cond.setCurrentRadioStation(setCurrentRadioStation);
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Order(2)           //==== Выставляем текущую радиостанцию используя параметры Min/Max=====
    @ParameterizedTest
    @CsvSource({
            "9,10", "10,10", "11,11", "34,34", "49,49", "50,50", "51,50"
    })
    public void WeSetTheCurrentRadioStationWithTheParameters(int setCurrentRadioStation, int expected) {

        Radio cond = new Radio(10, 50);
        cond.setCurrentRadioStation(setCurrentRadioStation);
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Order(3)           //===== Переключение радиостанций на следующую =====
    @ParameterizedTest
    @CsvSource({
            "0,1", "1,2", "8,9", "9,0"
    })
    public void SwitchToTheNextRadioStation(int setCurrentRadioStation, int expected) {

        cond.setCurrentRadioStation(setCurrentRadioStation);
        cond.setNextRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)           //===== Переключение радиостанции на предыдущую =====
    @ParameterizedTest
    @CsvSource({
            "0,9", "1,0", "5,4", "9,8"
    })
    public void SwitchingTheRadioToThePreviousStation(int setCurrentRadioStation, int expected) {

        cond.setCurrentRadioStation(setCurrentRadioStation);
        cond.setRewRadioStation();
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Order(5)           //===== Выставляем текущую громкость звука =====
    @ParameterizedTest
    @CsvSource({
            "-1,0", "0,0", "1,1", "37,37", "99,99", "100,100", "101,100"
    })
    public void WeAdjustTheSoundVolumeWithTheParameters(int setSoundVolume, int expected) {

        cond.setSoundVolume(setSoundVolume);
        int actual = cond.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Order(6)               //===== Прибавляем громкость звука =====
    @ParameterizedTest
    @CsvSource({
            "0,1", "1,2", "44,45", "99,100", "100,100"
    })
    public void IncreaseTheSoundVolume(int setSoundVolume, int expected) {

        cond.setSoundVolume(setSoundVolume);
        cond.setIncreaseSoundVolume();
        int actual = cond.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Order(8)               //===== Убавляем громкость звука =====
    @ParameterizedTest
    @CsvSource({
            "0,0", "1,0", "57,56", "99,98", "100,99"
    })
    public void DecreaseTheSoundVolume(int setSoundVolume, int expected) {

        cond.setSoundVolume(setSoundVolume);
        cond.setDecreasingVolume();
        int actual = cond.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}