package org.spring.boot.projectspringphoneshop.utils;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneralUtilsTest {

    @Test
    public void testToIntegerList(){

        // Given
        List<String> names = List.of("Dara", "Cheata", "Thida");
        //When
        List<Integer> list = GeneralUtils.toIntegerList(names);
        //Then
        assertEquals(3, list.size());
        //assertEquals(4, list.get(0l));
    }
}
