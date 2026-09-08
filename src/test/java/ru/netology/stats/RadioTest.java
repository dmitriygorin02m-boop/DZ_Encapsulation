package ru.netology.stats;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RadioTest {


    @Order(1)
    @ParameterizedTest
    @CsvSource({
            "-1,0", "0,0", "1,1", "5,5", "8,8", "9,9", "10,0"
    })

    public void WeSetTheCurrentRadioStation(int setCurrentRadioStation, int expected) {

        if (setCurrentRadioStation == -1) {
            System.out.println();
            System.out.println("==== Выставляем текущую радиостанцию =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Выставляем", "Ожидаемый результат", "Фактический результат");
        }

        Radio cond = new Radio();
        cond.setCurrentRadioStation(setCurrentRadioStation);

        int actual = cond.getCurrentRadioStation();
        System.out.printf("%-10d | %-20d | %-20d |%n", setCurrentRadioStation, expected, actual);
        System.out.println();

        Assertions.assertEquals(expected, actual);
    }


    @Order(2)
    @ParameterizedTest
    @CsvSource({
            "0,1", "1,2", "8,9", "9,0"
    })
    public void SwitchToTheNextRadioStation(int setCurrentRadioStation, int expected) {

        if (setCurrentRadioStation == 0) {
            System.out.println();
            System.out.println(
                    "===== Переключение радиостанций на следующую =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Текущая", "Ожидаемый результат", "Фактический результат");
        }

        Radio cond = new Radio();

        cond.setCurrentRadioStation(setCurrentRadioStation);
        cond.setNextRadioStation();

        int actual = cond.getCurrentRadioStation();
        System.out.println();

        System.out.printf("%-10d | %-20d | %-20d |%n", setCurrentRadioStation, expected, actual);
        Assertions.assertEquals(expected, actual);
    }

    @Order(3)
    @ParameterizedTest
    @CsvSource({
            "0,9", "1,0", "5,4", "9,8"
    })
    public void SwitchingTheRadioToThePreviousStation(int setCurrentRadioStation, int expected) {
        if (setCurrentRadioStation == 0) {
            System.out.println();
            System.out.println("===== Переключение радиостанции на предыдущую =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Текущая", "Ожидаемый результат", "Фактический результат");
        }
        Radio cond = new Radio();
        cond.setCurrentRadioStation(setCurrentRadioStation);
        cond.setRewRadioStation();
        int actual = cond.getCurrentRadioStation();

        System.out.println();
        System.out.printf("%-10d | %-20d | %-20d |%n", setCurrentRadioStation, expected, actual);

        Assertions.assertEquals(expected, actual);
    }

    @Order(4)
    @ParameterizedTest
    @CsvSource({
            "-1,0", "0,0", "1,1", "37,37", "99,99", "100,100", "101,0"
    })
    public void WeAdjustTheSoundVolume(int setSoundVolume, int expected) {
        if (setSoundVolume == -1) {
            System.out.println();
            System.out.println("===== Выставляем текущую громкость звука =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Выставляем", "Ожидаемый результат", "Фактический результат");
        }
        Radio cond = new Radio();

        cond.setSoundVolume(setSoundVolume);

        int actual = cond.getSoundVolume();

        System.out.println();
        System.out.printf("%-10d | %-20d | %-20d |%n", setSoundVolume, expected, actual);

        Assertions.assertEquals(expected, actual);

    }

    @Order(5)
    @ParameterizedTest
    @CsvSource({
            "0,1", "1,2", "44,45", "99,100", "100,100"
    })
    public void IncreaseTheSoundVolume(int setSoundVolume, int expected) {
        if (setSoundVolume == 0) {
            System.out.println();
            System.out.println("===== Прибавляем громкость звука =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Текущая", "Ожидаемый результат", "Фактический результат");
        }

        Radio cond = new Radio();

        cond.setSoundVolume(setSoundVolume);
        cond.setIncreaseSoundVolume();

        int actual = cond.getSoundVolume();

        System.out.println();
        System.out.printf("%-10d | %-20d | %-20d |%n", setSoundVolume, expected, actual);

        Assertions.assertEquals(expected, actual);
    }

    @Order(6)
    @ParameterizedTest
    @CsvSource({
            "0,0", "1,0", "57,56", "99,98", "100,99"
    })
    public void DecreaseTheSoundVolume(int setSoundVolume, int expected) {
        if (setSoundVolume == 0) {
            System.out.println();
            System.out.println("===== Убавляем громкость звука =====");
            System.out.println();
            System.out.printf(
                    "%-10s | %-20s | %-20s |%n", "Текущая", "Ожидаемый результат", "Фактический результат");
        }
        Radio cond = new Radio();
        cond.setSoundVolume(setSoundVolume);
        cond.setDecreasingVolume();
        int actual = cond.getSoundVolume();

        System.out.println();
        System.out.printf("%-10d | %-20d | %-20d |%n", setSoundVolume, expected, actual);

        Assertions.assertEquals(expected, actual);

    }
}