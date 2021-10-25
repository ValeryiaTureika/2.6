package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void maxVolume() {
        Radio rad = new Radio();

        int actual = rad.getMaxVolume();
        int expected = 100;
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
        rad.setCurrentSoundVolume(352);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(100);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(101);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(99);

        int actual = rad.getCurrentSoundVolume();
        int expected = 99;
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
        rad.setCurrentSoundVolume(50);

        int actual = rad.getCurrentSoundVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }


    @Test
    public void maxVolumeUpperLimitDesigner() {
        Radio rad = new Radio(320);

        int actual = rad.getMaxVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeNormalDesigner() {
        Radio rad = new Radio(53);

        int actual = rad.getMaxVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeLowerLimitDesigner() {
        Radio rad = new Radio(-67);

        int actual = rad.getMaxVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void minVolumeUpperLimitDesigner() {
        Radio rad = new Radio(375);

        int actual = rad.getMinVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void minVolumeNormalDesigner() {
        Radio rad = new Radio(43);

        int actual = rad.getMinVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void minVolumeLowerLimitDesigner() {
        Radio rad = new Radio(-39);

        int actual = rad.getMinVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void currentSoundVolumeNumberBeyondUpperLimitDesigner() {
        Radio rad = new Radio(340);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue1Designer() {
        Radio rad = new Radio(101);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue2Designer() {
        Radio rad = new Radio(100);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeUpperLimitValue3Designer() {
        Radio rad = new Radio(99);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue1Designer() {
        Radio rad = new Radio(1);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue2Designer() {
        Radio rad = new Radio(0);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeLowerLimitValue3Designer() {
        Radio rad = new Radio(-1);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeNumberBeyondLowerLimitDesigner() {
        Radio rad = new Radio(-2);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentSoundVolumeAverageNumberNormalRangeDesigner() {
        Radio rad = new Radio(59);
        rad.getCurrentSoundVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 59;
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
        int expected = 1;
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
        rad.setIncreaseVolume(103);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(101);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(100);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setIncreaseVolume(99);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeNumberBeyondLowerLimitDesigner() {
        Radio rad = new Radio(-345);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue1Designer() {
        Radio rad = new Radio(-1);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue2Designer() {
        Radio rad = new Radio(0);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowerLimitValue3Designer() {
        Radio rad = new Radio(1);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAverageNumberNormalRange1Designer() {
        Radio rad = new Radio(56);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 57;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNumberBeyondUpperLimitDesigner() {
        Radio rad = new Radio(109);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue1Designer() {
        Radio rad = new Radio(101);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue2Designer() {
        Radio rad = new Radio(100);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLimitValue3Designer() {
        Radio rad = new Radio(99);
        rad.getIncreaseVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
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
        rad.setIndoorVolume(50);

        int actual = rad.getCurrentSoundVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeNumberBeyondUpperLimit() {
        Radio rad = new Radio();
        rad.setIndoorVolume(520);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue1() {
        Radio rad = new Radio();
        rad.setIndoorVolume(101);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue2() {
        Radio rad = new Radio();
        rad.setIndoorVolume(100);

        int actual = rad.getCurrentSoundVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue3() {
        Radio rad = new Radio();
        rad.setIndoorVolume(99);

        int actual = rad.getCurrentSoundVolume();
        int expected = 98;
        assertEquals(expected, actual);
    }


    @Test
    public void indoorVolumeNumberBeyondLowerLimitDesigner() {
        Radio rad = new Radio(-300);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue1Designer() {
        Radio rad = new Radio(-1);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue2Designer() {
        Radio rad = new Radio(0);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeLowerLimitValue3Designer() {
        Radio rad = new Radio(1);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeAverageNumberNormalRangeDesigner() {
        Radio rad = new Radio(50);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeNumberBeyondUpperLimitDesigner() {
        Radio rad = new Radio(305);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue1Designer() {
        Radio rad = new Radio(101);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue2Designer() {
        Radio rad = new Radio(100);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void indoorVolumeUpperLimitValue3Designer() {
        Radio rad = new Radio(99);
        rad.getIndoorVolumeDesigner();

        int actual = rad.getCurrentSoundVolume();
        int expected = 98;
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
    public void defaultSizeRadioStations() {
        Radio rad = new Radio();

        int actual = rad.getSizeRadioStations();
        int expected = 10;
        assertEquals(expected, actual);
    }


    @Test
    public void maxRadioStationUpperLimitDesigner() {
        Radio rad = new Radio(15, 14);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();


        int actual = rad.getMaxRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    public void minRadioStationLowerLimitDesigner() {
        Radio rad = new Radio(-1, -5);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();


        int actual = rad.getMinRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void maxRadioStationLowerLimitDesigner() {
        Radio rad = new Radio(5, 4);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();


        int actual = rad.getMaxRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStations() {
        Radio rad = new Radio();

        int actual = rad.getSizeRadioStations();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsDesigner() {
        Radio rad = new Radio(7, 8);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsUpperLimitDesigner() {
        Radio rad = new Radio(15, 14);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsUpperLimitValue1Designer() {
        Radio rad = new Radio(11, 12);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsUpperLimitValue2Designer() {
        Radio rad = new Radio(10, 11);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsUpperLimitValue3Designer() {
        Radio rad = new Radio(9, 10);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsLowerLimitDesigner() {
        Radio rad = new Radio(-562, 14);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsLowerLimitValue1Designer() {
        Radio rad = new Radio(0, 12);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void SizeRadioStationsLowerLimitValue2Designer() {
        Radio rad = new Radio(-1, 11);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sizeRadioStationsLowerLimitValue3Designer() {
        Radio rad = new Radio(1, 10);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getSizeRadioStations();
        int expected = 1;
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
    public void currentRadioStationBeyondUpperLimitDesigner() {
        Radio rad = new Radio(55, 55);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue1Designer() {
        Radio rad = new Radio(10, 10);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue2Designer() {
        Radio rad = new Radio(9, 9);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationUpperLimitValue3Designer() {
        Radio rad = new Radio(8, 8);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationBeyondLowerLimitDesigner() {
        Radio rad = new Radio(-16, -16);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit1Designer() {
        Radio rad = new Radio(-1, -1);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit2Designer() {
        Radio rad = new Radio(0, 0);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationLowerLimit3Designer() {
        Radio rad = new Radio(1, 1);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationAverageNumberNormalRangeDesigner() {
        Radio rad = new Radio(5, 5);
        rad.getSizeRadioStationsDesigner();
        rad.getCurrentRadioStationNumberDesigner();

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
    public void nextRadioStationNumberBeyondUpperLimitDesigner() {
        Radio rad = new Radio(5, 34);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit1Designer() {
        Radio rad = new Radio(10, 10);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();
        ;

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit2Designer() {
        Radio rad = new Radio(10, 9);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberUpperLimit3Designer() {
        Radio rad = new Radio(8, 8);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberBeyondLowerLimitDesigner() {
        Radio rad = new Radio(6, -64);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit1Designer() {
        Radio rad = new Radio(-1, -1);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit2Designer() {
        Radio rad = new Radio(0, 0);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberLowerLimit3Designer() {
        Radio rad = new Radio(1, 1);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberAverageNormalRangeDesigner() {
        Radio rad = new Radio(5, 5);
        rad.getSizeRadioStationsDesigner();
        rad.getNextRadioStationNumberDesigner();

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


    @Test
    public void prevRadioStationNumberBeyondLowerLimitDesigner() {
        Radio rad = new Radio(8, -64);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit1Designer() {
        Radio rad = new Radio(-1, -1);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit2Designer() {
        Radio rad = new Radio(0, 0);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLowerLimit3Designer() {
        Radio rad = new Radio(1, 1);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberBeyondUpperLimitDesigner() {
        Radio rad = new Radio(52, 52);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit1Designer() {
        Radio rad = new Radio(10, 10);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit2Designer() {
        Radio rad = new Radio(9, 9);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberUpperLimit3Designer() {
        Radio rad = new Radio(8, 8);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberAverageNormalRangeDesigner() {
        Radio rad = new Radio(5, 5);
        rad.getSizeRadioStationsDesigner();
        rad.getPrevRadioStationNumberDesigner();

        int actual = rad.getCurrentRadioStationNumber();
        int expected = 4;
        assertEquals(expected, actual);
    }
}




