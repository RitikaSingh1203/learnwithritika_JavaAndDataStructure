public class TrappingRainwater {
    public static int Trapped_RainWater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        // calculate right max boundary - array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapped_water = 0;
        //loop
        for(int i = 0; i < n; i++){
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            trapped_water += WaterLevel - height[i];
        }

        System.out.println("Trapped Water: " + trapped_water);
        return trapped_water;
    }
 

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        Trapped_RainWater(height);
    }
}
