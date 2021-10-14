package ru.netology.domain;

public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    public int getMaxVolume() {
        return 10;
    }

    public int getMinVolume() {
        return 0;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }


    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < getMinVolume()) {
            return;
        }
        if (currentSoundVolume > getMaxVolume()) {
            currentSoundVolume = getMaxVolume();
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    public void setIncreaseVolume(int currentSoundVolume) {
        if (getMaxVolume() > currentSoundVolume && currentSoundVolume > getMinVolume()) {
            this.currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume >= getMaxVolume()) {
            this.currentSoundVolume = getMaxVolume();
        } else {
            return;
        }
    }

    public void setIndoorVolume(int currentSoundVolume) {
        if (getMinVolume() < currentSoundVolume && currentSoundVolume <= getMaxVolume()) {
            this.currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume > getMaxVolume()) {
            this.currentSoundVolume = getMaxVolume();
        } else {
            return;
        }
    }


    public int getMaxRadioStation() {
        return 9;
    }

    public int getMinRadioStation() {
        return 0;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }


    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < getMinRadioStation()) {
            return;
        }
        if (currentRadioStationNumber > getMaxRadioStation()) {
            currentRadioStationNumber = getMaxRadioStation();
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }


    public void setNextRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber >= getMinRadioStation() && currentRadioStationNumber < getMaxRadioStation()) {
            this.currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber > getMaxRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
        } else {
            return;
        }
    }


    public void setPrevRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber > getMinRadioStation() && currentRadioStationNumber <= getMaxRadioStation()) {
            this.currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == getMinRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
        }
        if (currentRadioStationNumber > getMaxRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
        } else {
            return;
        }
    }
}