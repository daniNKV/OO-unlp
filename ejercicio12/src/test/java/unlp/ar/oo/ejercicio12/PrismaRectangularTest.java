package unlp.ar.oo.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrismaRectangularTest {
    PrismaRectangular prisma;

    @BeforeEach
    public void setUp() {
        this.prisma = new PrismaRectangular(
                "Metal",
                "Verde",
                10,
                10,
                20);
    }

    @Test
    public void testGetVolumen() {
    }

    @Test
    public void testGetSuperficie() {
    }
}