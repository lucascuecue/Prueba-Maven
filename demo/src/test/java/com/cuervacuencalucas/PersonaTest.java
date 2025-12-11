package com.cuervacuencalucas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testCreatePersonaFromDelimitedString() {
        // AAA (Arrange, Act, Assert)
        // Arrange
        String input = "Juan,Garcia,juan@email.com,25";
        // Act
        Persona persona = Persona.createPersonaFromDelimitedString(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getName());
        assertEquals("Garcia", persona.getSurname());
        assertEquals(25, persona.getAge());
        assertEquals("juan@email.com", persona.getEmail());
    }

    @Test
        void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.createPersonaFromDelimitedString(input));
    }
}
