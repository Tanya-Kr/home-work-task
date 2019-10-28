package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = speedKm * 0.6214;
        return result;
    }

    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = speedMi / 0.6214;
        return result;
    }

}
