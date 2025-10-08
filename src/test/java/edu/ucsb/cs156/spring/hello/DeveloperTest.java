package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Mon F.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("monraphael-maker", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-05", t.getName());
        assertTrue(t.getMembers().contains("Brian S."), "Team should contain Brian S.");
        assertTrue(t.getMembers().contains("Hechenjin Y."), "Team should contain Hechenjin Y.");
        assertTrue(t.getMembers().contains("Jasmine T."), "Team should contain Jasmine T.");
        assertTrue(t.getMembers().contains("Kennedy N."), "Team should contain Kennedy N.");
        assertTrue(t.getMembers().contains("Melvin M."), "Team should contain Melvin M.");
        assertTrue(t.getMembers().contains("Mon F."), "Team should contain Mon F.");
    }
}
