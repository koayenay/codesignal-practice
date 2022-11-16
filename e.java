/* Question:
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer statues

An array of distinct non-negative integers.

Guaranteed constraints:
1 ≤ statues.length ≤ 10,
0 ≤ statues[i] ≤ 20.

[output] integer

The minimal number of statues that need to be added to existing statues such that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.

*/

int solution(int[] statues) {
    /*
    [6,2,3,8]
    [2,3,_,_,6,_,8]
     0 1 2 3 4 5 6
    array size: n+1 =7
    given: 4
    
    [4  5 2 1]= 4
    [1,2,_,4,5] =  n+1=5
     0,1,2,3,4
    */
    int min = statues[0];
    int max = statues[0];
    int len,ans;
    for(int i=0;i<statues.length;i++){
        if(statues[i]<min){
            min= statues[i];
        }
        if(statues[i]>max){
            max=statues[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
    len = (max-min)+1;
    ans= len-statues.length;
    return ans;
    }
    


