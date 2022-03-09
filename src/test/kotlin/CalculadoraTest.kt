import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calctest = Calculadora()
    @Test
    fun sumTest() {
        assertEquals(3, calctest.sum(1,2))
    }

    @Test
    fun subTest() {
        assertEquals(1, calctest.sub(3,2))
    }

    @Test
    fun multTest() {
        assertEquals(6, calctest.mult(2,3))
    }

    @Test
    fun diviTest() {
        assertEquals(2, calctest.divi(4,2))
    }

}