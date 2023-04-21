package sopt.org.firstSeminar.BasicClass;

public class People {
    int height;
    int weight;

    People(){
        this(175, 60);
    }

    People(int height){
        this(height, 60);
    }

    People(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}
