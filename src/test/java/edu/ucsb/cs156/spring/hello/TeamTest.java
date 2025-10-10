package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void case1_equals_functions_correctly() {
        // Case 1
        assert(team.equals(team));
    }

    @Test
    public void case2_equals_functions_correctly() {
        Object o = new Object();
        
        // Case 2
        assert(!team.equals(o));
    }

    @Test
    public void case3_equals_functions_correctly_TT() {
        Team team1 = new Team("test-team");
        team1.addMember("Alice");
        Team team2 = new Team("test-team");
        team2.addMember("Alice");
        assertEquals(team1, team2);
    }

    @Test
    public void case3_equals_functions_correctly_TF() {
        Team team1 = new Team("test-team");
        team1.addMember("Alice");
        Team team2 = new Team("test-team");
        team2.addMember("Bob");
        assertFalse(team1.equals(team2));
    }

    @Test
    public void HashCode_functions_correctly() {
        // instantiate t as a Team object
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
