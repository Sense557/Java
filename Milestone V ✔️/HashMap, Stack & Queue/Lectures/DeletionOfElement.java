pop () {
    if(top == -1) {
        print ("Stack Unserflow");
    }
    else {
        x = arr(top);
        top = top - 1;
    }
    return x;
}
