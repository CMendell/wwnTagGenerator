package com.company;

import java.util.Random;
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
    public void significantTerrainGenerator(){
        Random random = new Random();
        int i = random.nextInt(20);
        switch (i){
            case 0:
                System.out.println("Ancient farmland. A huge stretch of land\n" +
                        "was re-engineered for optimal farming.");
                break;
            case 1:
                System.out.println("""
                        Arratu wasteland. An area here was
                        once xenoformed by the Outsiders into
                        an environment hostile to humanity or one
                        inhabited by dangerous alien lifeforms.""");
                break;
            case 2:
                System.out.println("Blasted lands. Radioactive or scorched\n" +
                        "over by ancient war. Many ruins are likely.");
                break;
            case 3:
                System.out.println("""
                        Canyons. A region with extensive canyons
                        cut by rivers present or long-vanished. Make
                        sure the rivers don’t climb after leaving them.""");
                break;
            case 4:
                System.out.println("Dense forest. Trackless, dark, and an\n" +
                        "effective natural barrier.");
                break;
            case 5:
                System.out.println("Grasslands. A broad sweep of savanna or\n" +
                        "grassy plains is a coherent whole here.");
                break;
            case 6:
                System.out.println("Islands. There’s a single significant island\n" +
                        "off the coast or an archipelago of some note");
                break;
            case 7:
                System.out.println("""
                        Jagged mountains. A new or resharpened mountain range forms a barrier
                        in the region. The mountains are young, tall,
                        and likely cast a substantial rain shadow.""");
                break;
            case 8:
                System.out.println("Jungle. A classic adventure-worthy jungle\n" +
                        "of wild, semi-alien flora and fauna.");
                break;
            case 9:
                System.out.println("Light forest. Interspersed with other terrain.");
                break;
            case 10:
                System.out.println("Megaplex. The ruins of a single huge\n" +
                        "ancient structure stretch for endless miles.");
                break;
            case 11:
                System.out.println("""
                        Pit. A Deep or some other underground
                        megastructure collapsed and left a hole with
                        a diameter measured in tens of miles""");
                break;
            case 12:
                System.out.println("Rain forest. Vast, damp, and green");
                break;
            case 13:
                System.out.println("""
                        Rocky hills. Rough and stony, with little
                        arable land. Herding and raiding are the
                        most profitable employments here.""");
                break;
            case 14:
                System.out.println("Rolling hills. A stretch of gently rolling hills\n" +
                        "makes for good agricultural land.");
                break;
            case 15:
                System.out.println("""
                        Sand desert. This desert is a waste of sand
                        and dunes. It may be from a rain shadow, or
                        it might be a legacy of ancient war""");
                break;
            case 16:
                System.out.println("""
                        Scrub desert. These often appear on the
                        leeward side of mountain ranges. Borders
                        will often be grasslands or savanna""");
                break;
            case 17:
                System.out.println("Swamp. A sinking river, lake margin, or wet\n" +
                        "coastal delta forms a vast bog in this flat land.");
            case 18:
                System.out.println("""
                        Volcano. One or more mountains in a
                        nearby range are volcanically active. This
                        may be natural or it may be a consequence
                        of Legacy flux or ancient manipulation.""");
                break;
            case 19:
                System.out.println("""
                        Weathered mountains. A significant skirt
                        of hills is common. The rain shadow is likely
                        limited due to the rounded, low mountains.""");
                break;
        }
        System.out.println("\nPress enter to continue");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();
    }
    public void terrainFeatureGenerator(){
        String danger = null;
        String use = null;
        String lastEvent = null;
        String population = null;
        String antagonists = null;
        String quirk = null;

        Random random = new Random();
        int dangerRoll = random.nextInt(6);
        switch (dangerRoll) {
            case 0 -> danger = "Safer than usual for someplace like it";
            case 1 -> danger = "There’s one notable kind of danger there";
            case 2 -> danger = "It’s got some site-specific flavors of peril";
            case 3 -> danger = "It’s unusually dangerous in several ways";
            case 4 -> danger = "It will quickly kill the unprepared or unwary";
            case 5 -> danger = "It’s a death zone for all but the strongest";
        }
        int useRoll = random.nextInt(8);
        switch (useRoll) {
            case 0 -> use = "A rare and precious resource is found there";
            case 1 -> use = "Ancient sites and relics are common there";
            case 2 -> use = "It’s sacred land to a group or religion";
            case 3 -> use = "Controlling it has military significance";
            case 4 -> use = "It has substantial productive infrastructure";
            case 5 -> use = "A major trade route goes through it";
            case 6 -> use = "Uncontrolled, it’s a nest of raiders and worse";
            case 7 -> use = "A mighty Working is still functioning there";
        }
        int lastEventRoll = random.nextInt(10);
        switch (lastEventRoll) {
            case 0 -> lastEvent = "A significant battle was fought there";
            case 1 -> lastEvent = "A mad prophet tried to start a faith there";
            case 2 -> lastEvent = "A usurper and supporters fled into it";
            case 3 -> lastEvent = "A resource strike drew numerous people";
            case 4 -> lastEvent = "A major nest of bandits or raiders formed";
            case 5 -> lastEvent = "A rich ancient ruin was discovered there";
            case 6 -> lastEvent = "An uncanny plague erupted in the area";
            case 7 -> lastEvent = "Some grim and terrible thing was awoken";
            case 8 -> lastEvent = "A community of outcasts or marginals formed";
            case 9 -> lastEvent = "A natural or uncanny disaster struck there";
        }
        int popRoll = random.nextInt(4);
        switch (popRoll) {
            case 0 -> population = "Almost unpopulated for something like it";
            case 1 -> population = "Very few settlers or workers there";
            case 2 -> population = "Average or more population density";
            case 3 -> population = "A rush of people have gone there";
        }
        int antagRoll = random.nextInt(12);
        switch (antagRoll) {
            case 0 -> antagonists = "Violent secessionist rebels";
            case 1 -> antagonists = "Angry cultists of a local faith";
            case 2 -> antagonists = "Locals who resent interloping outsiders";
            case 3 -> antagonists = "A type of cunning, dangerous beast";
            case 4 -> antagonists = "Relic-creatures of ancient settlements";
            case 5 -> antagonists = "Elemental emanations of the disordered land";
            case 6 -> antagonists = "A hostile sentient monster civilization";
            case 7 -> antagonists = "Brutal envoys of the central government";
            case 8 -> antagonists = "Raiders and bandits driven into the area";
            case 9 -> antagonists = "Rapacious local lords and gang bosses";
            case 10 -> antagonists = "Remnants of a furious native population";
            case 11 -> antagonists = "Outsider remnants with a bitter grudge";
        }
        int quirkRoll = random.nextInt(20);
        switch (quirkRoll) {
            case 0 -> quirk = "It has significant magical structures in it";
            case 1 -> quirk = "It has a place in the national origin legend";
            case 2 -> quirk = "It is entirely man-made by ancient arts";
            case 3 -> quirk = "Time and space sometimes slip there";
            case 4 -> quirk = "The magical power there attracts wizards";
            case 5 -> quirk = "It subtly changes those who live there";
            case 6 -> quirk = "It’s holy land to a particular faith";
            case 7 -> quirk = "It was formerly a different kind of terrain";
            case 8 -> quirk = "It has human-worked vistas of beauty";
            case 9 -> quirk = "It was formerly an Outsider stronghold";
            case 10 -> quirk = "A significant part of it is subterranean";
            case 11 -> quirk = "It’d expand were it not for ancient wards";
            case 12 -> quirk = "It was a nature preserve of a megastructure";
            case 13 -> quirk = "It’s maintained by an ancient artificial mind";
            case 14 -> quirk = "Magic is somehow warped in its area";
            case 15 -> quirk = "The flora and fauna are queasily “off”";
            case 16 -> quirk = "The locals once populated it more heavily";
            case 17 -> quirk = "Rulership of the feature is widely disputed";
            case 18 -> quirk = "It’s riddled with caves and delvings";
            case 19 -> quirk = "A unique type of sentient lives there";
        }
        System.out.println("How Dangerous is the Feature: " + "\033[31;1m" + danger + "\033[0m");
        System.out.println("What use is the Feature: " + "\033[31;1m" + use + "\033[0m");
        System.out.println("What Kind of Event Last Happened There: "+ "\033[31;1m" + lastEvent+ "\033[0m");
        System.out.println("How Populated is the Feature: " + "\033[31;1m"+ population+ "\033[0m");
        System.out.println("What Antagonists are Common There: " + "\033[31;1m"+ antagonists+ "\033[0m");
        System.out.println("Optional Quirk of the Feature: " + "\033[31;1m"+ quirk+ "\033[0m");

        System.out.println("\nPress enter to continue");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();
    }
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
