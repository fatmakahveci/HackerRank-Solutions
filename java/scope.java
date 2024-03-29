public Difference(int[] elements) {
    this.elements=elements;
    this.maximumDifference=maximumDifference;
}

public void computeDifference() {
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<elements.length;i++) {
        int currentElement=Math.abs(elements[i]);
        if(currentElement<min)
            min=currentElement;
        if(currentElement>max)
            max=currentElement;
     }
    maximumDifference=Math.abs(max-min);
}
