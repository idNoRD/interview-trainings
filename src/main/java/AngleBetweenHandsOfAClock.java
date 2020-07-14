/**
 * Given two numbers, hour and minutes. Return the smaller angle (in degrees)
 * formed between the hour and the minute hand.
 *
 * Input: hour = 12, minutes = 30
 * Output: 165
 *
 * Input: hour = 3, minutes = 15
 * Output: 7.5
 *
 */
public class AngleBetweenHandsOfAClock {

    public double angleClock(int hour, int minutes) {

        final double DEGREES_PER_HOUR = 30.0;
        final double DEGREES_PER_MINUTE = 6.0;
        final double MINUTES_IN_HOUR = 60.0;
        final double MAX_DEGREES = 360;

        double angleOfHour = hour * DEGREES_PER_HOUR;
        if (minutes > 0) {
            angleOfHour += DEGREES_PER_HOUR / (MINUTES_IN_HOUR / minutes);
        }
        if (angleOfHour >= MAX_DEGREES) {
            angleOfHour -= MAX_DEGREES;
        }

        double angleOfMinute = minutes * DEGREES_PER_MINUTE;

        double smallerAngle;
        if (angleOfHour > angleOfMinute) {
            smallerAngle = angleOfHour - angleOfMinute;
        } else {
            smallerAngle = angleOfMinute - angleOfHour;
        }
        if (smallerAngle > MAX_DEGREES / 2) {
            smallerAngle = MAX_DEGREES - smallerAngle;
        }

        return smallerAngle;
    }

}
