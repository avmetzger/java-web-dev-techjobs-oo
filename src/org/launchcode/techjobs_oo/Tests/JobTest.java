package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs_oo.*;

import javax.tools.JavaFileObject;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class JobTest {
    private Job testJob1;
    private Job testJob2;

    @Before
    public void createJobObjects(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId(){
        assertEquals(testJob1.getId(),testJob2.getId()-1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(testJob1.getName(), "Product tester");
        assertEquals(testJob1.getEmployer().getValue(), "ACME");
        assertEquals(testJob1.getLocation().getValue(), "Desert");
        assertEquals(testJob1.getPositionType().getValue(),"Quality control");
        assertEquals(testJob1.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(testJob1.equals(testJob2));
    }
}
