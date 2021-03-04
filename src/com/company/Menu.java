package com.company;

import java.util.Scanner;

public class Menu {
    public boolean mainMenu(){
        while(true) {
            System.out.println("1: Significant Terrain Feature Generator");
            System.out.println("2: Terrain Feature Detail Generator");
            System.out.println("3: Nation Construction Generator");
            System.out.println("4: Nation Theme Generator");
            System.out.println("5: Society Physical Appearance Generator");
            System.out.println("6: Society Values + Social Identity");
            System.out.println("7: Government Construction");
            System.out.println("8: Government Details");
            System.out.println("9: History Construction");
            System.out.println("10: Historical Events Generator");
            System.out.println("11: Religion Constructor");
            System.out.println("12: Temple Detail Generator");
            System.out.println("13: Malevolent Cult Generator");
            System.out.println("14: Ruins Generator");
            System.out.println("15: Places of Adventure Generator");
            System.out.println("16: Rural Village Generator");
            System.out.println("17: Major City Generator");
            System.out.println("18: Tribes/Exile Generator");
            System.out.println("19: Community Tag Generator");
            System.out.println("20: Aristocratic Court Generator");
            System.out.println("21: Business Court Generator");
            System.out.println("22: Criminal Court Generator");
            System.out.println("23: Familial Clan Court Generator");
            System.out.println("24: Religious Court Generator");
            System.out.println("25: Court Tag Generator");
            System.out.println("26: Ruin Feature Generator");
            System.out.println("27: Ruin Tag Generator");
            System.out.println("28: Wilderness Encounter Generator");
            System.out.println("29: Wilderness Tags");
            System.out.println("30: Combat Challenge Complications");
            System.out.println("31: Types of Ruin Sites");
            System.out.println("32: Framework of Inhabitation");
            System.out.println("33: Types of Inhabitants");
            System.out.println("34: Rooms of Interest");
            System.out.println("35: Hex Points of Interest");
            System.out.println("36: Room Layout and Map Features");
            System.out.println("37: Stocking Room Generator");
            System.out.println("38: Wandering Encounter Generator");
            System.out.println("39: Investigation Generator");
            System.out.println("40: Social Challenge Generator");
            System.out.println("41: Exit Program");
            System.out.println("Please Enter Selection: ");
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.nextLine();
            switch (selection){
                case "1" :
                    significantTerrainGenerator();
                    break;
                case "2" :
                    terrainFeatureGenerator();
                    break;
                case "3" :
                    nationConstructionGenerator();
                    break;
                case "4" :
                    nationThemeGenerator();
                    break;
                case "5" :
                    societyPhysicalAppearance();
                    break;
                case "6" :
                    societyValuesGenerator();
                    break;
                case "7" :
                    governmentConstruction();
                    break;
                case "8" :
                    governmentDetails();
                    break;
                case "9" :
                    historyConstruction();
                    break;
                case "10" :
                    historicalEventsConstruction();
                    break;
                case "11" :
                    religionConstruction();
                    break;
                case "12" :
                    templeDetailConstruction();
                    break;
                case "13" :
                    malevolentCultGenerator();
                    break;
                case "14" :
                    ruinsGenerator();
                    break;
                case "15" :
                    placeOfAdventureGenerator();
                    break;
                case "16" :
                    ruralVillageGenerator();
                    break;
                case "17" :
                    majorCityGenerator();
                    break;
                case "18" :
                    tribesExileGenerator();
                    break;
                case "19" :
                    communityTagGenerator();
                    break;
                case "20" :
                    aristocraticCourtGenerator();
                    break;
                case "21" :
                    businessCourtGenerator();
                    break;
                case "22" :
                    criminalCourtGenerator();
                    break;
                case "23" :
                    familialClanGenerator();
                    break;
                case "24" :
                    religiousCourtGenerator();
                    break;
                case "25" :
                    courtTagGenerator();
                    break;
                case "26" :
                    ruinFeatureGenerator();
                    break;
                case "27" :
                    ruinTagGenerator();
                    break;
                case "28" :
                    wildernessEncounterGenerator();
                    break;
                case "29" :
                    wildernessTag();
                    break;
                case "30" :
                    combatChallengeComplications();
                    break;
                case "31" :
                    typesOfRuinSite();
                    break;
                case "32" :
                    frameworkOfInhabitation();
                    break;
                case "33" :
                    typesOfInhabitants();
                    break;
                case "34" :
                    roomsOfInterest();
                    break;
                case "35" :
                    hexPointsOfInterest();
                    break;
                case "36" :
                    roomLayoutAndMapFeatures();
                    break;
                case "37" :
                    stockingRoomGenerator();
                    break;
                case "38" :
                    wanderingEncounterGenerator();
                    break;
                case "39" :
                    investigationGenerator();
                    break;
                case "40" :
                    socialChallengeGenerator();
                    break;
                case "41" :
                    return true;
            }
        }
    }
    public void significantTerrainGenerator(){}
    public void terrainFeatureGenerator(){}
    public void nationConstructionGenerator(){}
    public void nationThemeGenerator(){}
    public void societyPhysicalAppearance(){}
    public void societyValuesGenerator(){}
    public void governmentConstruction(){}
    public void governmentDetails(){}
    public void historyConstruction(){}
    public void historicalEventsConstruction(){}
    public void religionConstruction(){}
    public void templeDetailConstruction(){}
    public void malevolentCultGenerator(){}
    public void ruinsGenerator(){}
    public void placeOfAdventureGenerator(){}
    public void ruralVillageGenerator(){}
    public void majorCityGenerator(){}
    public void tribesExileGenerator(){}
    public void communityTagGenerator(){}
    public void aristocraticCourtGenerator(){}
    public void businessCourtGenerator(){}
    public void criminalCourtGenerator(){}
    public void familialClanGenerator(){}
    public void religiousCourtGenerator(){}
    public void courtTagGenerator(){}
    public void ruinFeatureGenerator(){}
    public void ruinTagGenerator(){}
    public void wildernessEncounterGenerator(){}
    public void wildernessTag(){}
    public void combatChallengeComplications(){}
    public void typesOfRuinSite(){}
    public void frameworkOfInhabitation(){}
    public void typesOfInhabitants(){}
    public void roomsOfInterest(){}
    public void hexPointsOfInterest(){}
    public void roomLayoutAndMapFeatures(){}
    public void stockingRoomGenerator(){}
    public void wanderingEncounterGenerator(){}
    public void investigationGenerator(){}
    public void socialChallengeGenerator(){}
}
