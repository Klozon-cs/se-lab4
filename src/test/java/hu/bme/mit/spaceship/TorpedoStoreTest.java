package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1, 1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(false, result);
    }


    @Test
    void fire_Multiple_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(10, 0);

        boolean result = store.isEmpty();
        if(!result) {
            store.fire(4);
        }
        int remaining = store.getTorpedoCount();
        // Assert
        assertEquals(6, remaining);
        assertFalse(result);
    }
}
