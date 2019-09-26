package problems.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #605
 */
public class CanPlaceFlowers {

	public static void main(String[] args) {
		int[] flowerbed = {0,0,0,0};
		int n=3;
		CanPlaceFlowers can = new CanPlaceFlowers();
		System.out.println(can.canPlaceFlowers(flowerbed, n));
		
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(n==0) return true;
		int counter =0;
		
		if(flowerbed.length == 1){
			if(flowerbed[0]==0 && (n == 0 || n == 1)){
				return true;
			}else{
				return false;
			}
		}else if(flowerbed.length == 2){
			if((flowerbed[0]==0 && flowerbed[1]==0) && (n == 0 || n == 1)){
				return true;
			}else{
				return false;
			}
		}else if(flowerbed.length == 3 || flowerbed.length == 4){
			if(flowerbed[0]==0 && flowerbed[1]==0){
				counter++;
			}
			if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
				counter++;
			}
	
	    }else if(flowerbed.length >4){
	    	if(flowerbed[0]==0 && flowerbed[1]==0){
				counter++;
			}
			if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
				counter++;
			}
			for(int i=2; i<flowerbed.length-1; i=i+2){
				if(flowerbed[i]==0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
						counter++;
					}
			}
		}
		
		return (counter >= n);
    }
}
