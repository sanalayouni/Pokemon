package com.sprintly.api;
import org.junit.jupiter.api.Test;
import com.sprintly.api.Models.Developer;
import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void shouldCreateDeveloper() {
        Developer developer = new Developer();

        developer.setName("Alice");
        developer.setEmail("alice@example.com");

        assertEquals("Alice", developer.getName());
        assertEquals("alice@example.com", developer.getEmail());
        assertNull(developer.getId());
    }
}
