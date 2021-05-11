//You are climbing a staircase that has n steps. You can take the steps either 1 or 2 at a time. 
//Calculate how many distinct ways you can climb to the top of the staircase.

//Given
int climbingStairs(int n) {
    //Write Code Here
    if(n < 3)
        return n;
    
    int firstStep = 1;
    int secondStep = 2;
    
    for (int i = 2; i < n; i++){
        int current = firstStep + secondStep;
        firstStep = secondStep;
        secondStep = current;
        
    }
    
    return secondStep;
    
    
}
