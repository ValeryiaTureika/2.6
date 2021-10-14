package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void maxVolume() {
        Radio rad = new Radio();

        int actual = rad.getMaxVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio rad = new Radio();

        int actual = rad.getMinVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void currentSoundVolumeNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(52);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(9);

        int actual = rad.getCurrentSoundVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(10);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(11);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue1() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue2() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue3() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeNumberBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(-18);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeAverageNumberNormalRange() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeNumberBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(-17);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue1() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue2() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue3() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAverageNumberNormalRange1() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(38);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(11);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(10);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(9);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }


    @Test
    public void indoorVolumeNumberBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setIndoorVolume(-34);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue1() {
        Radio rad = new Radio();
        rad.setIndoorVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue2() {
        Radio rad = new Radio();
        rad.setIndoorVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue3() {
        Radio rad = new Radio();
        rad.setIndoorVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeAverageNumberNormalRange() {
        Radio rad = new Radio();
        rad.setIndoorVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setIndoorVolume(52);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setIndoorVolume(11);

        int actual = rad.getCurrentSoundVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setIndoorVolume(10);

        int actual = rad.getCurrentSoundVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setIndoorVolume(9);

        int actual = rad.getCurrentSoundVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }


    @Test
    public void maxRadioStation() {
        Radio rad = new Radio();

        int actual = rad.getMaxRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void minRadioStation() {
        Radio rad = new Radio();

        int actual = rad.getMinRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void currentRadioStationBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(52);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(10);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(8);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-16);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit2() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationAverageNumberNormalRange() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(5);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    public void nextRadioStationNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(34);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit1() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(10);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit2() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(9);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit3() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(8);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(-67);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit1() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(-1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit2() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(0);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit3() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberAverageNormalRange() {
        Radio rad = new Radio();
        rad.setNextRadioStationNumber(5);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationNumberBeyondLowerLimit() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(-72);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit1() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(-1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit2() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(0);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit3() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(1);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(52);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit1() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(10);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit2() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(9);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit3() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(8);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberAverageNormalRange() {
        Radio rad = new Radio();
        rad.setPrevRadioStationNumber(5);

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 4;
        assertEquals(expected, actual);
    }
}




