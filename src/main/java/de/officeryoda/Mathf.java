package de.officeryoda;

public class Mathf {

    /**
     * Well it's Pi.
     */
    public static final float PI = (float) Math.PI;

    /**
     * Positive Infinity and beyond...
     */
    public static final float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;

    /**
     * Negative Infinity and beyond...
     */
    public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;

    /**
     * Degrees-to-radians conversion constant.
     */
    public static final float Deg2Rad = (float) (Math.PI / 180d);

    /**
     * Radians-to-degrees conversion constant.
     */
    public static final float Rad2Deg = (float) (180d / Math.PI);

    /**
     * A tiny(the tiniest) floating point value.
     */
    public static final float EPSILON = Float.MIN_VALUE;

    /**
     * @param   f
     * @return  The absolute value of f.
     */
    public static float abs(float f) {
        if(f < 0)
            return  -f;
        else
            return f;
    }

    /**
     * @param   value
     * @return  The absolute value of value;
     */
    public static int abs(int value) {
        if(value < 0)
            return -value;
        else
            return value;
    }

    /**
     * Returns the arc cosine of a value; the returned angle is in the
     * range 0.0 through <i>pi</i>.  Special case:
     * <ul><li>If the argument is NaN or its absolute value is greater
     * than 1, then the result is NaN.</ul>
     *
     * @param   f the value whose arc cosine is to be returned.
     * @return  the arc cosine of the argument.
     */
    public static float acos(float f) {
        return (float) Math.acos(f);
    }

    /**
     * @param   a
     * @param   b
     * @return  Compares two floating point values and returns true if they are similar with a margin of 0.1f.
     */
    public static boolean approximately(float a, float b) {
        return approximately(a, b, 0.1f);
    }

    /**
     * @param   a
     * @param   b
     * @param   margin maximum amount of difference between a and b
     * @return  Compares two floating point values and returns true if they are similar.
     */
    public static boolean approximately(float a, float b, float margin) {
        float dif = abs(a - b);
        return dif < margin;
    }

    /**
     * Returns the arc sine of a value; the returned angle is in the
     * range -<i>pi</i>/2 through <i>pi</i>/2.  Special cases:
     * <ul><li>If the argument is NaN or its absolute value is greater
     * than 1, then the result is NaN.
     * <li>If the argument is zero, then the result is a zero with the
     * same sign as the argument.</ul>
     *
     * @param   f   the value whose arc sine is to be returned.
     * @return  the arc sine of the argument.
     */
    public static float asin(float f) {
        return (float) Math.asin(f);
    }

    /**
     * Returns the arc tangent of a value; the returned angle is in the
     * range -<i>pi</i>/2 through <i>pi</i>/2.  Special cases:
     * <ul><li>If the argument is NaN, then the result is NaN.
     * <li>If the argument is zero, then the result is a zero with the
     * same sign as the argument.</ul>
     *
     * @param   f   the value whose arc tangent is to be returned.
     * @return  the arc tangent of the argument.
     */
    public static float atan(float f) {
        return (float) Math.atan(f);
    }

    /**
     * Returns the angle <i>theta</i> from the conversion of rectangular
     * coordinates ({@code x},&nbsp;{@code y}) to polar
     * coordinates (r,&nbsp;<i>theta</i>).
     * This method computes the phase <i>theta</i> by computing an arc tangent
     * of {@code y/x} in the range of -<i>pi</i> to <i>pi</i>. Special
     * cases:
     * <ul><li>If either argument is NaN, then the result is NaN.
     * <li>If the first argument is positive zero and the second argument
     * is positive, or the first argument is positive and finite and the
     * second argument is positive infinity, then the result is positive
     * zero.
     * <li>If the first argument is negative zero and the second argument
     * is positive, or the first argument is negative and finite and the
     * second argument is positive infinity, then the result is negative zero.
     * <li>If the first argument is positive zero and the second argument
     * is negative, or the first argument is positive and finite and the
     * second argument is negative infinity, then the result is the
     * {@code double} value closest to <i>pi</i>.
     * <li>If the first argument is negative zero and the second argument
     * is negative, or the first argument is negative and finite and the
     * second argument is negative infinity, then the result is the
     * {@code double} value closest to -<i>pi</i>.
     * <li>If the first argument is positive and the second argument is
     * positive zero or negative zero, or the first argument is positive
     * infinity and the second argument is finite, then the result is the
     * {@code double} value closest to <i>pi</i>/2.
     * <li>If the first argument is negative and the second argument is
     * positive zero or negative zero, or the first argument is negative
     * infinity and the second argument is finite, then the result is the
     * {@code double} value closest to -<i>pi</i>/2.
     * <li>If both arguments are positive infinity, then the result is the
     * {@code double} value closest to <i>pi</i>/4.
     * <li>If the first argument is positive infinity and the second argument
     * is negative infinity, then the result is the {@code double}
     * value closest to 3*<i>pi</i>/4.
     * <li>If the first argument is negative infinity and the second argument
     * is positive infinity, then the result is the {@code double} value
     * closest to -<i>pi</i>/4.
     * <li>If both arguments are negative infinity, then the result is the
     * {@code double} value closest to -3*<i>pi</i>/4.</ul>
     *
     * @param   y   the ordinate coordinate
     * @param   x   the abscissa coordinate
     * @return  the <i>theta</i> component of the point
     *          (<i>r</i>,&nbsp;<i>theta</i>)
     *          in polar coordinates that corresponds to the point
     *          (<i>x</i>,&nbsp;<i>y</i>) in Cartesian coordinates.
     */
    public static float atan2(float y, float x) {
        return (float) StrictMath.atan2(y, x);
    }

    /**
     * Returns the smallest (closest to negative infinity)
     * {@code double} value that is greater than or equal to the
     * argument and is equal to a mathematical integer. Special cases:
     * <ul><li>If the argument value is already equal to a
     * mathematical integer, then the result is the same as the
     * argument.  <li>If the argument is NaN or an infinity or
     * positive zero or negative zero, then the result is the same as
     * the argument.  <li>If the argument value is less than zero but
     * greater than -1.0, then the result is negative zero.</ul> Note
     * that the value of {@code StrictMath.ceil(x)} is exactly the
     * value of {@code -StrictMath.floor(-x)}.
     *
     * @param   f   a value.
     * @return  the smallest (closest to negative infinity)
     *          floating-point value that is greater than or equal to
     *          the argument and is equal to a mathematical integer.
     */
    public static float ceil(float f) {
        return (float) Math.ceil(f);
    }

    /**
     * Returns the smallest (closest to negative infinity)
     * {@code double} value that is greater than or equal to the
     * argument and is equal to a mathematical integer. Special cases:
     * <ul><li>If the argument value is already equal to a
     * mathematical integer, then the result is the same as the
     * argument.  <li>If the argument is NaN or an infinity or
     * positive zero or negative zero, then the result is the same as
     * the argument.  <li>If the argument value is less than zero but
     * greater than -1.0, then the result is negative zero.</ul> Note
     * that the value of {@code StrictMath.ceil(x)} is exactly the
     * value of {@code -StrictMath.floor(-x)}.
     *
     * @param   f   a value.
     * @return  the smallest (closest to negative infinity)
     *          floating-point value that is greater than or equal to
     *          the argument and is equal to a mathematical integer.
     */
    public static int ceilToInt(float f) {
        return (int) ceil(f);
    }

    /**
     * Clamps the given value between a range defined by the given minimum integer and
     * maximum integer values. Returns the given value if it is within min and max.
     *
     * @param   value   The integer point value to restrict inside the min-to-max range.
     * @param   min     The minimum integer point value to compare against.
     * @param   max     The maximum integer point value to compare against.
     * @return  The int result between min and max values.
     */
    public static int Clamp(int value, int min, int max) {
        if(value < min) value = min;
        else if(value > max) value = max;
        return value;
    }

    /**
     * Clamps the given value between the given minimum float and maximum float values.
     * Returns the given value if it is within the minimum and maximum range.
     *
     * @param   value   The floating point value to restrict inside the range defined by the minimum and maximum values.
     * @param   min     The minimum floating point value to compare against.
     * @param   max     The maximum floating point value to compare against.
     * @return  The float result between the minimum and maximum values.
     */
    public static float Clamp(float value, float min, float max) {
        if(value < min) value = min;
        else if(value > max) value = max;
        return value;
    }


    /**
     * Clamps value between 0 and 1 and returns value.
     *
     * @param value The floating point value to restrict inside the range 0 to 1.
     * @return The clamped value.
     */
    public static float Clamp01(float value) {
        return Clamp(value, 0F, 1F);
    }
}
