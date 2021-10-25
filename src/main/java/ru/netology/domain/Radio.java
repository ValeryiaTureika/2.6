package ru.netology.domain;

public class Radio {
    private int maxVolume = 100;
    private int minVolume;
    private int currentSoundVolume;
    private int currentRadioStationNumber;
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int sizeRadioStations = 10;

    public Radio() {
    }

    public Radio(int sizeRadioStations, int currentRadioStationNumber) {
        this.sizeRadioStations = sizeRadioStations;
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public Radio(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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

    public void getCurrentSoundVolumeDesigner() {
        if (currentSoundVolume < getMinVolume()) {
            currentSoundVolume = getMinVolume();
        }
        if (currentSoundVolume > getMaxVolume()) {
            currentSoundVolume = getMaxVolume();
        }
        this.currentSoundVolume = currentSoundVolume;
    }


    public void setIncreaseVolume(int currentSoundVolume) {
        if (getMaxVolume() > currentSoundVolume && currentSoundVolume >= getMinVolume()) {
            this.currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume >= getMaxVolume()) {
            this.currentSoundVolume = getMaxVolume();
        } else {
            return;
        }
    }

    public void getIncreaseVolumeDesigner() {
        if (getMaxVolume() > currentSoundVolume && currentSoundVolume >= getMinVolume()) {
            this.currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume >= getMaxVolume()) {
            this.currentSoundVolume = getMaxVolume();
        }
        if (currentSoundVolume < getMinVolume()) {
            this.currentSoundVolume = getMinVolume();
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

    public void getIndoorVolumeDesigner() {
        if (getMinVolume() < currentSoundVolume && currentSoundVolume <= getMaxVolume()) {
            this.currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume > getMaxVolume()) {
            this.currentSoundVolume = getMaxVolume();
        }
        if (currentSoundVolume < getMinVolume()) {
            this.currentSoundVolume = getMinVolume();
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

    public int getSizeRadioStations() {
        return sizeRadioStations;
    }

    public void getSizeRadioStationsDesigner() {
        if (sizeRadioStations <= (maxRadioStation + 1) && sizeRadioStations > minRadioStation) {
            this.sizeRadioStations = sizeRadioStations;
        }
        if (sizeRadioStations < minRadioStation) {
            this.sizeRadioStations = minRadioStation;
        }
        if (sizeRadioStations >= (maxRadioStation + 1)) {
            this.sizeRadioStations = (maxRadioStation + 1);
        } else {
            return;
        }
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

    public void getCurrentRadioStationNumberDesigner() {
        if (currentRadioStationNumber < getMinRadioStation()) {
            currentRadioStationNumber = getMinRadioStation();
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

    public void getNextRadioStationNumberDesigner() {
        if (currentRadioStationNumber < getMaxRadioStation() && currentRadioStationNumber >= getMinRadioStation()) {
            this.currentRadioStationNumber = currentRadioStationNumber + 1;
            return;
        }

        if (currentRadioStationNumber > getMaxRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
            return;
        }

        if (currentRadioStationNumber < getMinRadioStation()) {
            this.currentRadioStationNumber = getMinRadioStation();
        }

        if (currentRadioStationNumber == getMaxRadioStation()) {
            this.currentRadioStationNumber = getMinRadioStation();
            return;
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

    public void getPrevRadioStationNumberDesigner() {
        if (currentRadioStationNumber > getMinRadioStation() && currentRadioStationNumber <= getMaxRadioStation()) {
            this.currentRadioStationNumber = currentRadioStationNumber - 1;
            return;
        }
        if (currentRadioStationNumber == getMinRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
            return;
        }
        if (currentRadioStationNumber > getMaxRadioStation()) {
            this.currentRadioStationNumber = getMaxRadioStation();
        }
        if (currentRadioStationNumber < getMinRadioStation()) {
            this.currentRadioStationNumber = getMinRadioStation();
            return;
        } else {
            return;
        }
    }
}