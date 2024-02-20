package practise;

public class StockBuy {

    public static void main(String[] args) {

        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(new StockBuy().maxProfit(arr));

    }

    private int maxProfit(int[] prices) {

//		if (prices == null || prices.length <= 1)
//			return 0;
//
//		int min = prices[0]; // min so far
//		int result = 0;
//
//		for (int i = 1; i < prices.length; i++) {
//		//	result = Math.max(result, prices[i] - min);
//			if(result > prices[i] - min)
//				result =result;
//			else
//				result =prices[i] - min;
//				
//			//System.out.println(result);
//			//min = Math.min(min, prices[i]);
//			
//			if(min  < prices[i])
//				min  = min  ;
//			else
//				min =prices[i];
//		}
//
//		return result;
//
//	}

        if (prices == null || prices.length <= 1)
            return 0;

        int result = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > result) {
                result = prices[i] - min;
                System.out.println(result + "+prices[i]" + prices[i]);
            }
            if (prices[i] < min) {
                min = prices[i];
                System.out.println(":min"+min);
            }
        }
        return result;
    }
}

// 1 

//result  = 0 
//prices[i] = 1 
//max(0,1-7)
//min : 1

//out put 
//result  = 0
//prices[i] = 4
//max(0,4-1)
//min : 4

//out put 
//result  = 3
//prices[i] = 3
//max(3,3-1)
//min : 3
