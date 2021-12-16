package com.agrgic.CodingExercises.CE28PaintJob;

public class PaintJob {


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;

        return (int) Math.ceil((width * height - areaPerBucket * extraBuckets) / areaPerBucket);

    } // getBucketCount method


    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        return (int) Math.ceil(width * height / areaPerBucket);

    } // getBucketCount method, overloaded #1


    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0)
            return -1;

        return (int) Math.ceil(area / areaPerBucket);

    } // getBucketCount method, overloaded #2


} // PaintJob class
