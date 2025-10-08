package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Mon F.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "monraphael-maker";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-05");
        team.addMember("Brian S.");
        team.addMember("Hechenjin Y.");
        team.addMember("Jasmine T.");
        team.addMember("Kennedy N.");
        team.addMember("Melvin M.");
        team.addMember("Mon F.");
        return team;
    }
}
