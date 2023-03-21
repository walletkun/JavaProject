public class paintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(.75, .75, .5, 0));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            double volume = width * height;
            return (int) Math.ceil((volume / areaPerBucket)-(extraBuckets));
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            double volume = width * height;
            return (int) Math.ceil(volume / areaPerBucket);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        else{
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}
