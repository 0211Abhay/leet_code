class Solution {
    public int minBitFlips(int start, int goal) {
        //set bits which are different in both nums
        int diffNum = (start ^ goal);
        return setBitCnt(diffNum);
    }
    private int setBitCnt(int num){
        int bitCnt=0;
        while(num > 0){
            bitCnt++;
            num &= (num - 1);
        }
        return bitCnt;
    }
    }
