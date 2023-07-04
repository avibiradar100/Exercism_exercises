public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){

        int expectedMin =40;
        return expectedMin;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMin){

        int expectedMin=expectedMinutesInOven();
        return expectedMin - actualMin;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layersCnt){

        return layersCnt*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layersCnt,int actualMin){

        return preparationTimeInMinutes(layersCnt) + actualMin;
        
    }
}
