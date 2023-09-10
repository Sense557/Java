push () {

    //time complexity O(1)
    if(top == n-1) {
        print ("Stack Overflow");
    }
    else {
    //time complexity O(1)
        top = top + 1;
        arr [top] = x;
    }
}



