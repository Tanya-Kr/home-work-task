package com.hillel.lecture_2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/16/19
 */
public class FormulasTestTask {

    private Formulas formulas = new Formulas();

    @Test
    public void formula9Test() {
        double x = 25;
        double expectedResult = 0.47091985615225695;
        assertEquals(formulas.calculate9Formula(x), expectedResult);
    }

    @Test
    public void formula10Test() {
        double x = 26;
        double expectedResult = 0.8235340789142294;
        assertEquals(formulas.calculate10Formula(x), expectedResult);
    }

    @Test
    public void formula11Test() {
        double x = 27;
        double expectedResult = 169.547106790819;
        assertEquals(formulas.calculate11Formula(x), expectedResult);
    }

    @Test
    public void formula12Test() {
        double x = 28;
        double expectedResult = 1.3351102609440046;
        assertEquals(formulas.calculate12Formula(x), expectedResult);
    }

    @Test
    public void formula13Test() {
        double x = 29;
        double expectedResult = 0.2631086711629021;
        assertEquals(formulas.calculate13Formula(x), expectedResult);
    }

}
