package com.cd.maximum.profit;

public class MaxProfit<size> {

    /*
1.) Iterate through each number in the list.
2.) At the ith index, get the i+1 index price and check if it is larger than the ith index price.
3.) If so, set buy_price = i and sell_price = i+1. Then calculate the profit: sell_price - buy_price.
4.) If a stock price is found that is cheaper than the current buy_price, set this to be the new buying price and continue from step 2.
5.) Otherwise, continue changing only the sell_price and keep buy_price set.
     */
    public  static Integer find(Integer[] input)
    {
        int buy = 0, max = 0, sell = 0;
        int size = input.length;
        for(int i = 0; i < size - 1; i++)
        {
            if(input[i + 1] > input[i])
            {
                buy = input[i];
                sell = input[i + 1];
                max = sell - buy;
            }
            if(sell > buy)
            {
                buy = sell;

            }
            else
            {
                continue;

            }
        }
        return max;
    }
}
